package models;

public class DeliveryAgent {
    private final String id;
    private final String name;
    private final String phone;
    private boolean available;

    public DeliveryAgent(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}
