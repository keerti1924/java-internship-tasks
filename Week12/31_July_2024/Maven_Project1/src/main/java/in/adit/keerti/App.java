package in.adit.keerti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.adit.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String configLocation = "in/adit/resources/applicationContext.xml";
        ApplicationContext cxt = new ClassPathXmlApplicationContext(configLocation);
        
        Student std = (Student) cxt.getBean("stdId");
        std.display();
    }
}
