package login.spring.test;

import hello.spring.beans.IHelloSpring;
import login.spring.beans.ILogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ILogin login = (ILogin)context.getBean("login");
        System.out.println(login.check("admin", "1234"));
    }    
}

