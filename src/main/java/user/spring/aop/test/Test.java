package user.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import user.spring.aop.service.IUserService;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_aop_advice.xml");
        IUserService userService = (IUserService)context.getBean("userService");
        
        userService.update("vincent");
        //userService.save();
    }    
}

