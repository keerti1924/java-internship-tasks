package in.sp.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Employee;
import in.sp.beans.skill;

@Configuration
public class ConfigFile {
	@Bean
	public skill s1() {
//		skill s1 = new skill("MEAN", "Django","IBM Cloud","tensor");
		skill s1 = new skill();
		s1.setWeb("MEAN, Django");
		s1.setCloud("IBM Cloud");
		s1.setAi("tensor");
		s1.setData("Data Science");
		return s1;
	}
	
	
	@Bean
	public Employee emp1() {
//		Employee e1 = new Employee("Ajay", "ajay@gmail.com","8567459856", s1());
		Employee e1 = new Employee();
		e1.setName("Ajay");
		e1.setEmail("ajay@gmail.com");
		e1.setPhone("8957564789");
		e1.setSkill(s1());
		
		
		return e1;
		
	}
}
