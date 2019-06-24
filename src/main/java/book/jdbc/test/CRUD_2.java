package book.jdbc.test;

import book.jdbc.dao.IBookDao;
import static java.lang.System.out;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CRUD_2 {
    static IBookDao dao;
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        dao = (IBookDao) context.getBean("bookDao");
        delete();
    }
    
    public static void create() {
        dao.insert("JavaWeb", "Vincent", 780);
        System.out.println("Insert OK");
    }
    
    public static void read() {
        out.print(dao.query());
    }
    
    public static void update() {
        Map map = dao.get(1);
        if(map != null) {
            dao.update(
                    Integer.parseInt(map.get("id")+""), 
                    map.get("title") + "", 
                    map.get("author") + "", 
                    Integer.parseInt(map.get("price")+"") + 11);
            System.out.println("Update OK");
        } else {
            System.out.println("Update Cancel");
        }
    }
    
    public static void delete() {
        Map map = dao.get(2);
        if(map != null) {
            dao.delete(Integer.parseInt(map.get("id")+""));
            System.out.println("Delete OK");
        } else {
            System.out.println("Delete Cancel");
        }
    }
}
