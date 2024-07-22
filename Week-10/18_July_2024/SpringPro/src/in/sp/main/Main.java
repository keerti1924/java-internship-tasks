package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.StudentClass;
import in.sp.config.ConfigClass;

public class Main {

	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigClass.class);
		StudentClass std = (StudentClass) cxt.getBean("studentdata");
		std.show();
		

	}

}
