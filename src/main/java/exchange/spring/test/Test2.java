package exchange.spring.test;

import java.io.IOException;
import java.math.BigDecimal;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
public class Test2 {
    public static void main(String[] args) throws IOException {
        Stock stock = YahooFinance.get("2330.TW");
        System.out.println(stock);
        System.out.println(stock.getName());
        System.out.println(stock.getQuote());
        System.out.println(stock.getQuote().getAsk());
        System.out.println(stock.getQuote().getVolume());
        System.out.println(stock.getQuote().getChange());
        System.out.println(stock.getQuote().getChangeInPercent());
    }
}
