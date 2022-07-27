package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "Prototype")
public class Nurse {
public void assisted(){
    System.out.println("Nurse assisted");
}
}
