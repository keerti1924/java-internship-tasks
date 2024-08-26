package com.keerti.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        return "hello";
    }
}
