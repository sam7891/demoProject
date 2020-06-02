package com.example.demoProject.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoProject.pojo.User;

public interface UserRepo extends JpaRepository<User, Integer> {
 
}