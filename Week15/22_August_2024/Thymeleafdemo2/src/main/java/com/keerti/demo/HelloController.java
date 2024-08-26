package com.keerti.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	 @GetMapping("/")
	    public String Home(Model model) {
		 model.addAttribute("message", "Welcome to the Homepage!");
	        return "index";
	    }

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        model.addAttribute("user", new User("John Doe"));
        return "hello";
    }

    // Inner class for demonstration
    public static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}