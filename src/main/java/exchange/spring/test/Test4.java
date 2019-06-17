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

public class Test4 {
    public static void main(String[] args) throws IOException {
        // 歷史資料
        Calendar from = Calendar.getInstance();
        Calendar to = Calendar.getInstance();
        from.add(Calendar.MONTH, -1); // from 1 month ago

        Stock ex = YahooFinance.get("USDTWD=x");
        List<HistoricalQuote> list = ex.getHistory(from, to, Interval.DAILY);
        Collections.reverse(list);
        
        for(int i=0;i<list.size();i++) {
            HistoricalQuote quote = list.get(i);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.print(sdf.format(quote.getDate().getTime()) + "\t");
            System.out.print(quote.getOpen() + "\t");
            System.out.print(quote.getHigh()+ "\t");
            System.out.print(quote.getLow()+ "\t");
            System.out.print(quote.getClose()+ "\t");
            if(i < list.size() - 1) {
                HistoricalQuote pre_quote = list.get(i+1);
                if(quote.getClose() != null && pre_quote.getClose() != null) {
                    System.out.print(quote.getClose().subtract(pre_quote.getClose()));
                }
            }
            System.out.println();
        }
    }
}
