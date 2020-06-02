package com.example.demoProject.pojo;

import javax.persistence.Entity;

@Entity
public class Group {
	private int group_id;
	private String group_name, group_desc;

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getGroup_desc() {
		return group_desc;
	}

	public void setGroup_desc(String group_desc) {
		this.group_desc = group_desc;
	}

	public Group() {
		super();
	}

	public Group(int group_id, String group_name, String group_desc) {
		super();
		this.group_id = group_id;
		this.group_name = group_name;
		this.group_desc = group_desc;
	}

}
