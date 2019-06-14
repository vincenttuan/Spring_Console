package hello.spring.test;

import hello.spring.beans.IHelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext context = new FileSystemXmlApplicationContext("C:\\temp\\applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        IHelloSpring hello = (IHelloSpring)context.getBean("hello");
        hello.print();
    }    
}

