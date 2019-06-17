package exchange.spring.test;

import exchange.spring.beans.IFinance;
import login.spring.beans.ILogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IFinance finance = (IFinance)context.getBean("finance");
        System.out.println(finance.exchange("TWDUSD=x", 1000));
    }
}
