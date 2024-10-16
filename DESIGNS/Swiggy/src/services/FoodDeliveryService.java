package services;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import models.Customer;
import models.DeliveryAgent;
import models.MenuItem;
import models.Order;
import models.OrderItem;
import models.OrderStatus;
import models.Restaurant;

public class FoodDeliveryService {
    private static FoodDeliveryService instance;
    private final Map<String, Customer> customers;
    private final Map<String, Restaurant> restaurants;
    private final Map<String, Order> orders;
    private final Map<String, DeliveryAgent> deliveryAgents;

    private FoodDeliveryService() {
        customers = new ConcurrentHashMap<>();
        restaurants = new ConcurrentHashMap<>();
        orders = new ConcurrentHashMap<>();
        deliveryAgents = new ConcurrentHashMap<>();
    }

    public static synchronized FoodDeliveryService getInstance() {
        if (instance == null) {
            instance = new FoodDeliveryService();
        }
        return instance;
    }

    public void registerCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public void registerRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getId(), restaurant);
    }

    public void registerDeliveryAgent(DeliveryAgent agent) {
        deliveryAgents.put(agent.getId(), agent);
    }

    public List<Restaurant> getAvailableRestaurants() {
        return new ArrayList<>(restaurants.values());
    }

    public List<MenuItem> getRestaurantMenu(String restaurantId) {
        Restaurant restaurant = restaurants.get(restaurantId);
        if (restaurant != null) {
            return restaurant.getMenu();
        }
        return new ArrayList<>();
    }

    public Order PlaceOrder(String customerId, String restaurantId, List<OrderItem> items) {
        Customer customer = customers.get(customerId);
        Restaurant restaurant = restaurants.get(restaurantId);
        if (customer != null && restaurant != null) {
            Order order = new Order(generateOrderId(), customer, restaurant);
            for (OrderItem item : items) {
                order.addItem(item);
            }
            orders.put(order.getId(), order);
            notifyRestaurant(order);
            System.out.println("Order placed  " + order.getId());
            return order;
        }
        return null;
    }

    public void updateOrderStatus(String orderId, OrderStatus status) {
        Order order = orders.get(orderId);
        if (order != null) {
            order.setStatus(status);
            notifyCustomer(order);
            if (status == OrderStatus.CONFIRMED) {
                assignDeliveryAgent(order);
            }
        }
    }

    public void cancelOrder(String orderId) {
        Order order = orders.get(orderId);
        if (order != null && order.getStatus() == OrderStatus.PENDING) {
            order.setStatus(OrderStatus.CANCELLED);
            notifyCustomer(order);
            notifyRestaurant(order);
            System.out.println("Order cancelled: " + order.getId());
        }
    }

    private void notifyCustomer(Order order) {
        // Send notification to the customer about the order status update
        String message = "";
        switch (order.getStatus()) {
            case CONFIRMED:
                message = "Your order has been accepted by driver: " + order.getId();
                break;
            case PREPARING:
                message = "Your order is preparing";
                break;
            case OUT_FOR_DELIVERY:
                message = "Your order is out for delivery";
                break;
            case DELIVERED:
                message = "Your order has been delivered" + order.getId();
                break;
            case CANCELLED:
                message = "Your order has been cancelled";
                break;
            default:
                break;
        }
        // Send notification to the customer
        System.out.println("Notifying customers: " + order.getId() + " - " + message);
    }

    private void notifyRestaurant(Order order) {
        // Send notification to the restaurant about the new order or order status
        // update
        String message = "";
        switch (order.getStatus()) {
            case CONFIRMED:
                message = "assigned a  order from restaurant and orderId is: " + order.getId();
                break;
            case CANCELLED:
                message = "order has been cancelled orderId " + order.getId();
                break;
            default:
                break;
        }
        // Send notification to the Restaurant
        System.out.println("Notifying restaurant: " + order.getId() + " - " + message);
    }

    private void assignDeliveryAgent(Order order) {
        for (DeliveryAgent agent : deliveryAgents.values()) {
            if (agent.isAvailable()) {
                agent.setAvailable(false);
                order.assignDeliveryAgent(agent);
                notifyDeliveryAgent(order);
                break;
            }
        }
    }

    private void notifyDeliveryAgent(Order order) {
        // Send notification to the delivery agent about the assigned order
        // ...

        String message = "";
        switch (order.getStatus()) {
            case CONFIRMED:
                message = "assigned a  order from restaurant and orderId is: " + order.getId();
                break;
            case PREPARING:
                message = "  order from restaurant is preparing: " + order.getId();
                break;
            case CANCELLED:
                message = "Your assigned has been cancelled";
                break;
            default:
                break;
        }
        // Send notification to the Restaurant
        System.out.println("Notifying restaurant: " + order.getId() + " - " + message);
    }

    private String generateOrderId() {
        // Generate a unique order ID using UUID
        return "ORD" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

}
