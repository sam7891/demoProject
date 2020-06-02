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

import com.example.demoProject.Service.GroupService;
import com.example.demoProject.pojo.Group;
@RestController
public class GroupController {
	private GroupService gservice;
	// Group
		// RESTful API methods for Retrieval operations
		@GetMapping("/home")
		public List<Group> list() {
			return gservice.listAllGroup();
		}

		// RESTful API method for Create operation
		@PostMapping("/home")
		public void addGroup(@RequestBody Group group) {
			gservice.saveGroup(group);
		}

		// RESTful API method for Update operation
		@PutMapping("/home/{group_id}")
		public ResponseEntity<?> update(@RequestBody Group group, @PathVariable Integer group_id) {
			try {
				// User existUser = service.get(id);
				gservice.saveGroup(group);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

		// RESTful API method for Delete operation
		@DeleteMapping("/home/{group_id}")
		public void deleteGrp(@PathVariable Integer group_id) {
			gservice.deleteGroup(group_id);
		}
}
