package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[]args) {
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = cxt.getBean(Student.class);
		std.display();
	}

}
