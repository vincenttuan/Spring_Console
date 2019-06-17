package exchange.spring.beans;

public class Finance implements IFinance {
    private IStockDao stockDao;

    public void setStockDao(IStockDao stockDao) {
        this.stockDao = stockDao;
    }
    
    @Override
    public double exchange(String symbol, double cash) {
        return stockDao.get(symbol) * cash;
    }
    
}
