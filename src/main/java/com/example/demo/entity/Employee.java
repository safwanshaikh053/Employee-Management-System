package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Master")
public class Employee {
	@Id
	@Column(name="emp_id", length = 3)
	@JsonProperty("empId")
	private String EmpId ;
	
	
	@Column(name="emp_name", length = 50)
	@JsonProperty("empName")
	private String EmpName;
	
	@Column(name="emp_dept")
	//@JsonProperty("emp")
	private int deptno;
	
	@Column(name="emp_sal")
	@JsonProperty("sal")
	private int Sal;
	
	
	public String getEmpId() {
		return EmpId;
	}


	public void setEmpId(String empId) {
		EmpId = empId;
	}


	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public int getSal() {
		return Sal;
	}


	public void setSal(int sal) {
		Sal = sal;
	}

	

	public Employee(String EmpId, String EmpName, int deptno, int Sal) {
		super();
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.deptno = deptno;
		this.Sal = Sal;
	}


	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", deptno=" + deptno + ", Sal=" + Sal + "]";
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

}