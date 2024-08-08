package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.beans.Student;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
        Student std = (Student) cxt.getBean("stdId");
        std.display();
    }
}
