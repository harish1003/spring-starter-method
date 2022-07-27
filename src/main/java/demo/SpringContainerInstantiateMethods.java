package demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringContainerInstantiateMethods {
    @PostConstruct
    public void init(){
        System.out.println("Init - methods");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy - Methods");
    }
}
