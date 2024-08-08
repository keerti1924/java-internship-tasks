package com.keerti.springroutes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.keerti.springroutes.model.User;

@Controller
public class HomeController {
	@GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/user")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }

    @PostMapping("/user")
    public String userSubmit(@RequestParam String name, @RequestParam String email, Model model) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        model.addAttribute("user", user);
        return "result";
    }
}
