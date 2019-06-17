package exchange.spring.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
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
        from.add(Calendar.MONTH, -6); // from 6 month ago

        Stock ex = YahooFinance.get("USDTWD=x");
        List<HistoricalQuote> list = ex.getHistory(from, to, Interval.DAILY);
        Collections.reverse(list);
        for(HistoricalQuote quote : list) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.print(sdf.format(quote.getDate().getTime()) + "\t");
            System.out.print(quote.getOpen() + "\t");
            System.out.print(quote.getHigh()+ "\t");
            System.out.print(quote.getLow()+ "\t");
            System.out.println(quote.getClose());
            
        }
    }
}
