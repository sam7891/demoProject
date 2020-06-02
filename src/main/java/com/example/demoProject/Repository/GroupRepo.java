package com.example.demoProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoProject.pojo.Group;

public interface GroupRepo extends JpaRepository<Group, Integer> {

}
