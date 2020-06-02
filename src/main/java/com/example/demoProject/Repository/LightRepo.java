package com.example.demoProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demoProject.pojo.Light;

public interface LightRepo extends JpaRepository<Light, Integer> {
	 
}

