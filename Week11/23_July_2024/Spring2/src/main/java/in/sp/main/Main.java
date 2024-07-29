package in.sp.main;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;

public class Main {
	public static void main(String[] args) {
		String path = "/in/sp/context/applicationContext.xml";
		@SuppressWarnings("resource")
		ApplicationContext cxt = new ClassPathXmlApplicationContext(path);
		
//		String path = "/in/sp/context/ConfigFile.class";
//		ApplicationContext cxt =  new AnnotationConfigApplicationContext(ConfigFile.class);
		Employee e1 = (Employee) cxt.getBean("emp1");
		
		e1.interview();
	}
}
