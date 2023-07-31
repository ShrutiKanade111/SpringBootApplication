package SpringFramework.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringFramework.SpringFramework.AppConfig.class);
        
        SpringFramework.SpringFramework.Department nep=context.getBean("department", SpringFramework.SpringFramework.Department.class);
        
        System.out.println(nep);
    }
}
 