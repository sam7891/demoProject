package com.example.demoProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demoProject.Repository.GroupRepo;
import com.example.demoProject.pojo.Group;

public class GroupService {
	// Group
	@Autowired
	private GroupRepo grepo;

	public List<Group> listAllGroup() {
		return grepo.findAll();
	}

	public void saveGroup(Group group) {
		grepo.save(group);
	}

	public Group getGroup(Integer group_id) {
		return grepo.findById(group_id).get();
	}

	public void deleteGroup(Integer group_id) {
		grepo.deleteById(group_id);
	}

	

}
