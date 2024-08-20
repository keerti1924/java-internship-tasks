package com.keerti.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerti.register.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
