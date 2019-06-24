package book.jdbc.test;

import book.jdbc.dao.IBookDaoMapper;
import book.jdbc.po.Book;
import static java.lang.System.out;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CRUD_3 {
    static IBookDaoMapper dao;
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        dao = (IBookDaoMapper) context.getBean("bookDaoMapper");
        read();
    }
    
    public static void read() {
        List<Book> list = dao.query();
        out.println(list.size());
        out.println(list);
    }
    
}
