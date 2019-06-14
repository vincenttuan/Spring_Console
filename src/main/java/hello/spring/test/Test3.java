package hello.spring.test;

import hello.spring.beans.IFastfood;
import hello.spring.beans.IHelloSpring;
import hello.spring.beans.ILottoSpring;
import hello.spring.beans.LottoSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IFastfood fastfood = (IFastfood)context.getBean("fastfood");
        fastfood.print();
        
    }    
}

