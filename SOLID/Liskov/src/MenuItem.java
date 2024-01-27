public class MenuItem {
    public int price;
    public String name;
    public String description;

    public MenuItem(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return this.price - this.getDiscount();
    }

    private double getDiscount() {
        return 0;
    }
};