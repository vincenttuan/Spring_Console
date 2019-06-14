package hello.spring.test;

import hello.spring.beans.IHelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        IHelloSpring hello = (IHelloSpring)context.getBean("hello");
        hello.print();
    }    
}

