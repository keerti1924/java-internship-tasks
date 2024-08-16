package com.keerti.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerti.springmvc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
