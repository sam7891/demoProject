//package com.example.demoProject.Service;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demoProject.Repository.GroupRepo;
//import com.example.demoProject.Repository.LightRepo;
//import com.example.demoProject.Repository.UserRepo;
//import com.example.demoProject.pojo.Group;
//import com.example.demoProject.pojo.Light;
//import com.example.demoProject.pojo.User;
//
//@Service
//@Transactional
//public class DemoService {
//		//User
//	@Autowired
//	private UserRepo urepo;
//
//	public List<User> listAll() {
//		return urepo.findAll();
//	}
//
//	public void save(User user) {
//		urepo.save(user);
//	}
//
//	public User get(Integer id) {
//		return urepo.findById(id).get();
//	}
//
//	public void delete(Integer id) {
//		urepo.deleteById(id);
//	}
//
//	// Group
//	@Autowired
//	private GroupRepo grepo;
//
//	public List<Group> listAllGroup() {
//		return grepo.findAll();
//	}
//
//	public void saveGroup(Group group) {
//		grepo.save(group);
//	}
//
//	public Group getGroup(Integer group_id) {
//		return grepo.findById(group_id).get();
//	}
//
//	public void deleteGroup(Integer group_id) {
//		grepo.deleteById(group_id);
//	}
//
//	// light
//	@Autowired
//	private LightRepo lrepo;
//
//	public List<Light> listAllLight() {
//		return lrepo.findAll();
//	}
//
//	public void saveLight(Light light) {
//		lrepo.save(light);
//	}
//
//	public Light getLight(Integer light_id) {
//		return lrepo.findById(light_id).get();
//	}
//
//	public void deleteLight(Integer light_id) {
//		lrepo.deleteById(light_id);
//	}
//
//}
