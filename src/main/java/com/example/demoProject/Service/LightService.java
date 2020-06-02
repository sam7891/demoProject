package com.example.demoProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demoProject.Repository.LightRepo;
import com.example.demoProject.pojo.Light;

public class LightService {
	// light
		@Autowired
		private LightRepo lrepo;

		public List<Light> listAllLight() {
			return lrepo.findAll();
		}

		public void saveLight(Light light) {
			lrepo.save(light);
		}

		public Light getLight(Integer light_id) {
			return lrepo.findById(light_id).get();
		}

		public void deleteLight(Integer light_id) {
			lrepo.deleteById(light_id);
		}
}
