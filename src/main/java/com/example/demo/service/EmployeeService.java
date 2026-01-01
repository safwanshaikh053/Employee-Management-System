package com.example.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repoObj;
	
	public Collection<Employee> getAll(){
		Collection<Employee> allEmployees = repoObj.findAll();
		return allEmployees;
	}
	
	public Employee getEmpById(String Id) {
		Optional<Employee> oRef = repoObj.findById(Id);
		Employee foundEmp =null;
		if(oRef.isPresent()) {
			foundEmp = oRef.get();
		}
		return foundEmp;
	}
	
	public void addNewEmp(Employee emp) {
		repoObj.save(emp);
	}
	
	public void removeEmp(String Id) {
		repoObj.deleteById(Id);
	}
	
	public Employee updateEmp(String Id,Employee emp) {
		Optional<Employee> oRef = repoObj.findById(Id);
		Employee foundEmp = null;
		if(oRef.isPresent()) {
			foundEmp = oRef.get();
			
			foundEmp.setEmpId(Id);
			
			foundEmp.setEmpName(emp.getEmpName());
			foundEmp.setDeptno(emp.getDeptno());
			foundEmp.setSal(emp.getSal());
			
			repoObj.save(foundEmp);
		}
		return foundEmp;
	}
	
	
	
	
}