package DESIGNS.Uber.src.models;

public class Driver {
    private int id;
    private String name;
    private String contact;
    private String licensePlate;
    private Location location;
    private DriverStatus status;

    public Driver(int id, String name, String contact, String licensePlate, Location location, DriverStatus status) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.licensePlate = licensePlate;
        this.location = location;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }
}
