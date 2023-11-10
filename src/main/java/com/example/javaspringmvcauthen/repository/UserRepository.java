package com.example.javaspringmvcauthen.repository;

import com.example.javaspringmvcauthen.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
