package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
class Doctor {

    String Qualification;

    public String getQualification() {
        return Qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Qualification='" + Qualification + '\'' +
                '}';
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor Assisted");
    }
}
