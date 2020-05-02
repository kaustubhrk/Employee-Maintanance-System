package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.EmployeeModel;
import com.cg.repository.EmployeeRepository;

@RestController
public class EmployeeCoontroller {

	@Autowired
	private EmployeeRepository repo;
	
	@GetMapping(value = "/login")
	public String login() {
		return "logged in";
	}
	
	@PostMapping(value = "/add")
	public String addEmployee() {
		return "Employee Added";
	}
	
//	@GetMapping(value = "/list")
//	public List<EmployeeModel> viewAllEmployee() {
//		return repo.findAll();
//	}
	
	@GetMapping(value = "/delete")
	public String deleteEmployee() {
		return "Deleted";
	}
	
	@PostMapping(value = "/modify")
	public String modifyEmployee() {
		return "Modified";
	}
	
}
