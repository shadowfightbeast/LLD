public class BeverageItem extends MenuItem {

    public BeverageItem(int price, String name, String description) {
        super(price, name, description);
    }

    public double getPrice() {
        return this.price - this.getDiscount();
    }

    private double getDiscount() {
        int discountPercentage = 10;
        return discountPercentage * .01 * this.price;
    }
};