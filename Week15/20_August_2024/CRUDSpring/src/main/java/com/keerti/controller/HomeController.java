package com.keerti.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keerti.model.User;
import com.keerti.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userservice;
	@GetMapping("/")
	public String Home(Model model) {
		 List<User> users = userservice.getAllUsers();
		 model.addAttribute("users", users);
		return "index";
	}
	
	@GetMapping("/register")
	public String Register(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		userservice.saveUser(user);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String updateUser(@PathVariable Long id, Model model) {
		Optional <User> user = userservice.getUserById(id);
		model.addAttribute("user", user);
		return "edit";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable Long id) {
		userservice.deleteUserById(id);
		return "redirect:/";
	}
}
