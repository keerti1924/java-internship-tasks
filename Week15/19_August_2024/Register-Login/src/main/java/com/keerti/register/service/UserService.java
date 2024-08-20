package com.keerti.register.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerti.register.model.User;
import com.keerti.register.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Add logic to encrypt the password (e.g., using BCrypt)
        return userRepository.save(user);
    }

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public boolean validateUser(String email, String password) {
        Optional<User> user = findUserByEmail(email);
        return user.isPresent() && user.get().getPassword().equals(password);
    }
}
