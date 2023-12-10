public class Cash implements Asset{
    double amount;
    public   Cash(double amount) {
        this.amount=amount;
    }
    @Override
    public double getMarketValue() {
        return amount;
    }
    @Override
    public double profit() {
        return 0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
