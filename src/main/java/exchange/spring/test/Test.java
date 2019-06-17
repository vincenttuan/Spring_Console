package exchange.spring.test;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;
/*
TWDUSD=x
JPYTWD=x
CNYTWD=x;
EURTWD=x
*/
public class Test {
    public static void main(String[] args) throws IOException {
        int money = 1000;
        //Stock stock = YahooFinance.get("TWDUSD=x");
        Stock stock = YahooFinance.get("USDTWD=x");
        double price = stock.getQuote().getPrice().doubleValue();
        System.out.println(price);
        System.out.println(price * money);
        
        Calendar from = Calendar.getInstance();
        Calendar to = Calendar.getInstance();
        from.add(Calendar.MONTH, -1); // from 1 month ago

        Stock ex = YahooFinance.get("USDTWD=x");
        List<HistoricalQuote> list = ex.getHistory(from, to, Interval.DAILY);
        for(HistoricalQuote quote : list) {
            System.out.println(quote.getClose());
        }
    }
}
