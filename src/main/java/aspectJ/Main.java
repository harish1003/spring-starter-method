package aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        context.getBean(ShoppingCart.class).checkOut(5,6);

    }
}
