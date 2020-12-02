package com.example.application.data.repositories;

import com.example.application.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User getByUsername(String username);

}