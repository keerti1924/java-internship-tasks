package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.StudentClass;


@Configuration
public class ConfigClass {

	@Bean
	public StudentClass studentdata() {
		StudentClass s1 = new StudentClass();
		s1.setName("Keerti");
		s1.setEmail("keerti@gmail.com");
		s1.setAge("24");
		return s1;
	}
	
}
