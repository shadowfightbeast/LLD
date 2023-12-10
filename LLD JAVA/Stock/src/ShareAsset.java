public class ShareAsset {
    private  String symbol;
    private double totalCost;
    private double currentPrice;

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public ShareAsset(String symbol, double totalCost, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }
    public void addCost(double cost){
         totalCost+=cost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice=currentPrice;}
}
