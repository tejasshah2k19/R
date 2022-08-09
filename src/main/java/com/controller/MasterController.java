package com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.MasterBean;

@RestController
public class MasterController {

	@PostMapping("/demo")
	public ResponseEntity<?> demo(@RequestBody MasterBean master ){
	
		System.out.println(master.getUser());
		System.out.println(master.getVehicle());
		System.out.println(master.getUser().getFirstName());
		System.out.println(master.getVehicle().getName());
		return ResponseEntity.ok(master);
	}
}
