package stock.orm.test;


import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import stock.orm.dao.IInvestorDao;
import stock.orm.dao.ITraderDao;
import stock.orm.model.Investor;
import stock.orm.model.Trader;
import static stock.orm.test.Trader_CRUD.queryAll;

public class Investor_CRUD {
    static ApplicationContext context;
    static IInvestorDao investorDao;
    static {
        context = new ClassPathXmlApplicationContext("applicationContext_stock.xml");
        investorDao = (IInvestorDao)context.getBean("investorDao");
    }
    public static void main(String[] args) {
        //add();
        queryAll().stream()
                .forEach(e -> {
                    System.out.printf("%s %f %d %s\n", e.getName(), e.getUnits(), e.getNetValue(), e.getFund());
                });
    }
    
    public static void add() {
        Investor inv1 = new Investor("Happy");
        Investor inv2 = new Investor("Lucky");
        investorDao.create(inv1);
        investorDao.create(inv2);
    }
    
    public static List<Investor> queryAll() {
        return investorDao.queryAll(Investor.class);
    }
    
}
