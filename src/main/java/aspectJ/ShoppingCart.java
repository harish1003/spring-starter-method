package aspectJ;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(int x, int i){
        System.out.println("checkOut method in shopping cart is called");
    }
}
