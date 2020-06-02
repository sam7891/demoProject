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

import com.example.demoProject.Service.LightService;
import com.example.demoProject.pojo.Light;
@RestController

public class LightController {
	private LightService lservice;
	// light
		// RESTful API methods for Retrieval operations
		@GetMapping("/home")
		public List<Light> llist() {
			return lservice.listAllLight();
		}

		// RESTful API method for Create operation
		@PostMapping("/home")
		public void addLight(@RequestBody Light light) {
			lservice.saveLight(light);
		}

		// RESTful API method for Update operation
		@PutMapping("/home/{light_id}")
		public ResponseEntity<?> update(@RequestBody Light light, @PathVariable Integer light_id) {
			try {
				// User existUser = service.get(id);
				lservice.saveLight(light);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

		// RESTful API method for Delete operation
		@DeleteMapping("/home/{light_id}")
		public void deleteLght(@PathVariable Integer light_id) {
			lservice.deleteLight(light_id);
		}

}
