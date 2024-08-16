package com.keerti.SpringBoot_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Student std, Model m) {
		System.out.println(std);
		m.addAttribute("name", std.getName());
		m.addAttribute("email", std.getEmail());
		m.addAttribute("city", std.getCity());
		m.addAttribute("phone", std.getPhone());
		return "register";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
}
