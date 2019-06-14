package hello.spring.test;

import hello.spring.beans.IHelloSpring;
import hello.spring.beans.ILottoSpring;
import hello.spring.beans.LottoSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ILottoSpring lotto = (ILottoSpring)context.getBean("lotto4");
        //ILottoSpring lotto2 = (ILottoSpring)context.getBean("lotto2");
        lotto.print();
        //lotto2.print();
    }    
}

