package com.example.demoProject.pojo;

import javax.persistence.Entity;

@Entity
public class Light {
	private int light_id;
	private String light_div, light_stat;

	public int getLight_id() {
		return light_id;
	}

	public void setLight_id(int light_id) {
		this.light_id = light_id;
	}

	public String getLight_div() {
		return light_div;
	}

	public void setLight_div(String light_div) {
		this.light_div = light_div;
	}

	public String getLight_stat() {
		return light_stat;
	}

	public void setLight_stat(String light_stat) {
		this.light_stat = light_stat;
	}

	public Light() {
		super();
	}

	public Light(int light_id, String light_div, String light_stat) {
		super();
		this.light_id = light_id;
		this.light_div = light_div;
		this.light_stat = light_stat;
	}

}
