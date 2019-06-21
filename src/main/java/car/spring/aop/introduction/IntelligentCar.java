package car.spring.aop.introduction;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class IntelligentCar extends DelegatingIntroductionInterceptor implements Intelligent{

    @Override
    public void selfDriving() {
        System.out.println("閃開~ 我是自駕車 !");
    }
    
}
