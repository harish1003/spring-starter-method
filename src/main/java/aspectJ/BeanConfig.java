package aspectJ;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "aspectJ")
@EnableAspectJAutoProxy
public class BeanConfig {


}
