//package com.example.demoProject.Controller;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//import org.springframework.beans.factory.annotation.*;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.demoProject.Service.GroupService;
//import com.example.demoProject.Service.LightService;
//import com.example.demoProject.Service.UserService;
//import com.example.demoProject.pojo.Group;
//import com.example.demoProject.pojo.Light;
////import com.example.demoProject.Service.DemoService;
//import com.example.demoProject.pojo.User;
//
//@RestController
//public class DemoController {
//
//	@Autowired
//	// private UserService service;
//	private UserService uservice;
//	private GroupService gservice;
//	private LightService lservice;
//
//	// user
//	// RESTful API methods for Retrieval operations
//	@GetMapping("/home")
//	public List<User> ulist() {
//		return uservice.listAll();
//	}
//
//	// RESTful API method for Create operation
//	@PostMapping("/home")
//	public void addUser(@RequestBody User user) {
//		uservice.saveUser(user);
//	}
//
//	// RESTful API method for Update operation
//	@PutMapping("/home/{id}")
//	public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
//		try {
//			// User existUser = service.get(id);
//			uservice.saveUser(user);
//			return new ResponseEntity<>(HttpStatus.OK);
//		} catch (NoSuchElementException e) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	// RESTful API method for Delete operation
//	@DeleteMapping("/home/{id}")
//	public void deleteUsr(@PathVariable Integer id) {
//		uservice.deleteUser(id);
//	}
//
//	// Group
//	// RESTful API methods for Retrieval operations
//	@GetMapping("/home")
//	public List<Group> list() {
//		return gservice.listAllGroup();
//	}
//
//	// RESTful API method for Create operation
//	@PostMapping("/home")
//	public void addGroup(@RequestBody Group group) {
//		gservice.saveGroup(group);
//	}
//
//	// RESTful API method for Update operation
//	@PutMapping("/home/{group_id}")
//	public ResponseEntity<?> update(@RequestBody Group group, @PathVariable Integer group_id) {
//		try {
//			// User existUser = service.get(id);
//			gservice.saveGroup(group);
//			return new ResponseEntity<>(HttpStatus.OK);
//		} catch (NoSuchElementException e) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	// RESTful API method for Delete operation
//	@DeleteMapping("/home/{group_id}")
//	public void deleteGrp(@PathVariable Integer group_id) {
//		gservice.deleteGroup(group_id);
//	}
//
//	// light
//	// RESTful API methods for Retrieval operations
//	@GetMapping("/home")
//	public List<Light> llist() {
//		return lservice.listAllLight();
//	}
//
//	// RESTful API method for Create operation
//	@PostMapping("/home")
//	public void addLight(@RequestBody Light light) {
//		lservice.saveLight(light);
//	}
//
//	// RESTful API method for Update operation
//	@PutMapping("/home/{light_id}")
//	public ResponseEntity<?> update(@RequestBody Light light, @PathVariable Integer light_id) {
//		try {
//			// User existUser = service.get(id);
//			lservice.saveLight(light);
//			return new ResponseEntity<>(HttpStatus.OK);
//		} catch (NoSuchElementException e) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	// RESTful API method for Delete operation
//	@DeleteMapping("/home/{light_id}")
//	public void deleteLght(@PathVariable Integer light_id) {
//		lservice.deleteLight(light_id);
//	}
//
//}