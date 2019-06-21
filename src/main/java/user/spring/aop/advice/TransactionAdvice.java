package user.spring.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TransactionAdvice {
    public void before(JoinPoint joinPoint) {
        if(joinPoint.getArgs() != null && joinPoint.getArgs().length > 0) {
            System.out.println("前置通知被執行:" + joinPoint.getArgs()[0]);
        } else {
            System.out.println("前置通知被執行");
        }
    }
    public void after(JoinPoint joinPoint) {
        System.out.println("後置通知被執行(不論是否有錯誤發生)");
    }
    
    public void after_returning(JoinPoint joinPoint) {
        System.out.println("後置通知被執行(沒錯誤發生)");
    }
    
    public void after_throwing(JoinPoint joinPoint) {
        System.out.println("後置通知被執行(有錯誤發生)");
    }
    
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("環繞通知 Begin");
        Object[] arg = point.getArgs();
        arg[0] = arg[0] + ".tw";
        Object proceed = point.proceed(arg); // update(), save() etc...
        System.out.println("環繞通知 End");
        return proceed;
    }
    
}
