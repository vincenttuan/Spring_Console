package exchange.spring.beans;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class StockDao implements IStockDao {

    @Override
    public double get(String symbol) {
        double price = 0;
        try {
            Stock stock = YahooFinance.get(symbol);
            price = stock.getQuote().getPrice().doubleValue();
        } catch (Exception e) {
        }
        return price;
    }
    
}
