package book.jdbc.test;

import book.jdbc.dao.IBookDao;
import static java.lang.System.out;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CRUD_2 {
    static IBookDao dao;
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        dao = (IBookDao) context.getBean("bookDao");
        read();
    }
    
    public static void create() {
        dao.insert("JavaWeb", "Vincent", 780);
    }
    
    public static void read() {
        out.print(dao.query());
    }
}
