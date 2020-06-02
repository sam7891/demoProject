package com.example.demoProject.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoProject.Service.UserService;
import com.example.demoProject.pojo.User;

@RestController

public class UserController {
	
	// user
		// RESTful API methods for Retrieval operations
	private UserService uservice;
		@GetMapping("/home")
		public List<User> ulist() {
			return uservice.listAll();
			
		}

		// RESTful API method for Create operation
		@PostMapping("/home")
		public void addUser(@RequestBody User user) {
			uservice.saveUser(user);
		}

		// RESTful API method for Update operation
		@PutMapping("/home/{id}")
		public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
			try {
				// User existUser = service.get(id);
				uservice.saveUser(user);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

		// RESTful API method for Delete operation
		@DeleteMapping("/home/{id}")
		public void deleteUsr(@PathVariable Integer id) {
			uservice.deleteUser(id);
		}

}
