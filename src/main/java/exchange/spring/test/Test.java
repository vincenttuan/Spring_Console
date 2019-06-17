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
    }
}
