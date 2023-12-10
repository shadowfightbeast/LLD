public class Stocks extends ShareAsset implements Asset{
    private int totalShares;

    public Stocks(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        totalShares=0;
    }

    @Override
    public double getMarketValue() {
        return totalShares*getCurrentPrice();
    }

    @Override
    public double getTotalShares() {
        return totalShares;
    }

    @Override
    public double getProfit() {
        return totalShares;
    }
}
