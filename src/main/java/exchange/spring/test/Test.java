package exchange.spring.test;

import java.io.IOException;
import java.math.BigDecimal;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
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
