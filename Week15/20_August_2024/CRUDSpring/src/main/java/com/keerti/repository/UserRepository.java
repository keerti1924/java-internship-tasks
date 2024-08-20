package com.keerti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerti.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
