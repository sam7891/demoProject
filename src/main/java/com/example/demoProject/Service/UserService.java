package com.example.demoProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demoProject.Repository.UserRepo;
import com.example.demoProject.pojo.User;

public class UserService {
	//User
	@Autowired
	private UserRepo urepo;

	public List<User> listAll() {
		return urepo.findAll();
	}

	public void saveUser(User user) {
		urepo.save(user);
	}

	public User get(Integer id) {
		return urepo.findById(id).get();
	}

	public void deleteUser(Integer id) {
		urepo.deleteById(id);
	}

	

	

}
