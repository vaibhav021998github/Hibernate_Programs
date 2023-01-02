package com.velocity.Mapping2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Employee {
	@Id
	@Column(name="Employee_Id")
	int empId;
	@Column(name="Employee_Name")
	String empName;
	@Column(name="Mobile_Number")
	String mobNum;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String mobNum) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.mobNum = mobNum;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	
	

}
