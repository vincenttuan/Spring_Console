package car.spring.aop.test;

import car.spring.aop.introduction.Auto;
import car.spring.aop.introduction.Intelligent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_aop_introduce.xml");
        Auto car = (Auto) context.getBean("myCar");
        car.driving();
        Intelligent aiCar = (Intelligent)car;
        aiCar.selfDriving();
    }    
}

