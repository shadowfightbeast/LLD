class Car {
    private String registrationNumber;
    private String brand;
    private String model;
    private double dailyRate;
    private CarStatus status;

    public Car(String registrationNumber, String brand, String model, double dailyRate) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.status = CarStatus.AVAILABLE;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }
}