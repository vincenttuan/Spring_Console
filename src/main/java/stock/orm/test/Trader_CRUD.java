package stock.orm.test;


import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import stock.orm.dao.IStockDao;
import stock.orm.dao.ITraderDao;
import stock.orm.model.Stock;
import stock.orm.model.Trader;

public class Trader_CRUD {
    static ApplicationContext context;
    static ITraderDao traderDao;
    static {
        context = new ClassPathXmlApplicationContext("applicationContext_stock.xml");
        traderDao = (ITraderDao)context.getBean("traderDao");
    }
    public static void main(String[] args) {
        
    }
    
    public static void add() {
        
    }
    
    public static void update(int id, String name) {
        
    }
    
    public static List<Trader> queryAll() {
        return null;
    }
    
}
