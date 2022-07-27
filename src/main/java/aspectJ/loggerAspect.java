package aspectJ;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class loggerAspect {
    @Before("execution(void aspectJ.ShoppingCart.checkOut(..))")
    public void beforelogger(){
        System.out.println("in logger");
    }
    @After("execution(void *.*.checkOut(..))")
    public void Afterlogger(){
        System.out.println("After logger");
    }

}
