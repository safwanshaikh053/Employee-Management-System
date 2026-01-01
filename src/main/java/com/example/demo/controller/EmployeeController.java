package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;




@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	EmployeeService serviceObj;
	
	@GetMapping("/emp")
	public Collection<Employee> getALl(){
		Collection<Employee> allEmployees = serviceObj.getAll();
		return allEmployees;
	}
	
	@GetMapping("/emp/{Id}")
	public Employee getOne(@PathVariable("Id") String Id) {
		Employee foundEmp = serviceObj.getEmpById(Id);
		return foundEmp;
	}
	
	@PostMapping("/empPost")
	public void postEmp(@RequestBody Employee emp) {
		serviceObj.addNewEmp(emp);
	}
	
	@DeleteMapping("/empDelete/{Id}")
	public void deleteEmp(@PathVariable("Id")String Id) {
		serviceObj.removeEmp(Id);
	}
	
	@PutMapping("/empPut/{Id}")
	public Employee updateEmp(@PathVariable("Id") String Id,@RequestBody Employee emp) {
		Employee foundEmp = serviceObj.updateEmp(Id, emp);
		return foundEmp;
	}
}
