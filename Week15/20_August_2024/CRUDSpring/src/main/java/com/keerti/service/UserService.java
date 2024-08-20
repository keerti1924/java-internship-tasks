package com.keerti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerti.model.User;
import com.keerti.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public void saveUser(User user) {
		userRepo.save(user);
	}
	
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    
    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }
    
    public void deleteUserById(Long id) {
    	userRepo.deleteById(id);
    }
}

