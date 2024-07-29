package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.sp.beans")
// @ComponentScan({"in.sp.beans", "------", "------"})  // multiple add
// @ComponentScan(basePackages = {"in.sp.beans"})      // multiple way to implement this
public class SpringConfigFile {
	
	

}
