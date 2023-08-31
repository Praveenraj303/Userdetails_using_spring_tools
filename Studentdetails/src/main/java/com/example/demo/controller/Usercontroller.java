package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
@RestController
public class Usercontroller {
	@Autowired
	public Userrepository repo;
	
	
	@PostMapping("/create")
	public Userentity addata(@RequestBody Userentity user) {
		try {
		
		repo.save(user);
		return user;
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}
	@GetMapping("/getall")
	public List<Userentity> get(){
		try {
		return repo.findAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		}
	@DeleteMapping("/getdel/{Id}")
	public String del(@PathVariable int Id) {
		@SuppressWarnings("deprecation")
		Userentity user=repo.getOne(Id);
		repo.delete(user);
		return "DELETE";
		
	}
	
	 
	@PutMapping("/update")
	public Userentity updateuser(@RequestBody Userentity user) {
		try {
		repo.save(user);
		return user;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	

}