package com.keerti.springmvc.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.keerti.springmvc.model.User;
import com.keerti.springmvc.service.UserService;

@Controller
public class UserController {

    private static String UPLOAD_DIR = "uploads/";

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/users/new")
    public String newUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user_form";
    }

    @PostMapping("/users")
    public String saveUser(@ModelAttribute User user, @RequestParam("profileImage") MultipartFile file, RedirectAttributes redirectAttributes) {
        if (!file.isEmpty()) {
            String filename = file.getOriginalFilename();
            Path path = Paths.get(UPLOAD_DIR + filename);
            try {
                Files.createDirectories(path.getParent());
                Files.write(path, file.getBytes());
                user.setProfileImagePath(filename);
            } catch (IOException e) {
                e.printStackTrace();
                redirectAttributes.addFlashAttribute("errorMessage", "Image upload failed!");
                return "redirect:/users/new";
            }
        }
        
        if (user.getId() == null) {
            // Adding a new user
            userService.saveUser(user);
            redirectAttributes.addFlashAttribute("successMessage", "User added successfully!");
        } else {
            // Updating an existing user
            userService.saveUser(user);
            redirectAttributes.addFlashAttribute("successMessage", "User updated successfully!");
        }
        return "redirect:/";
    }

    @GetMapping("/users/{id}")
    public String viewUser(@PathVariable Long id, Model model) {
        Optional<User> user = userService.getUserById(id);
        if (user.isPresent()) {
            model.addAttribute("user", user.get());
            return "user_details";
        }
        return "redirect:/";
    }

    @GetMapping("/users/edit/{id}")
    public String editUserForm(@PathVariable Long id, Model model) {
        Optional<User> user = userService.getUserById(id);
        if (user.isPresent()) {
            model.addAttribute("user", user.get());
            return "user_form";
        }
        return "redirect:/";
    }

    @PostMapping("/users/edit")
    public String updateUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
        userService.saveUser(user);
        redirectAttributes.addFlashAttribute("successMessage", "User updated successfully!");
        return "redirect:/";
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        userService.deleteUser(id);
        redirectAttributes.addFlashAttribute("successMessage", "User deleted successfully!");
        return "redirect:/";
    }
}