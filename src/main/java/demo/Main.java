package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]){
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        context.getBean(Doctor.class).assist();
        Doctor doctor =context.getBean(Doctor.class);
        doctor.setQualification("MBBS");
        System.out.println(doctor);
        Doctor doctor1 =context.getBean(Doctor.class);
        System.out.println(doctor1);
        context.close();


    }
}
