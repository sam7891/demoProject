package com.example.demoProject.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class User {


private int id,group_id,light_id;
private String uname,lname,password;

@Id

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getGroup_id() {
	return group_id;
}
public void setGroup_id(int group_id) {
	this.group_id = group_id;
}
public int getLight_id() {
	return light_id;
}
public void setLight_id(int light_id) {
	this.light_id = light_id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getPasssword() {
	return password;
}
public void setPasssword(String passsword) {
	this.password = passsword;
}
public User(int group_id, int light_id, String uname, String lname, String password) {
	super();
	this.group_id = group_id;
	this.light_id = light_id;
	this.uname = uname;
	this.lname = lname;
	this.password=password;
}
public User(int id, int group_id, int light_id, String uname, String lname, String password) {
	super();
	this.id = id;
	this.group_id = group_id;
	this.light_id = light_id;
	this.uname = uname;
	this.lname = lname;
	this.password=password;
}
public User() {
	super();
}


}
