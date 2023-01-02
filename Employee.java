package com.velocity.Mapping4;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Employee {
	@Id
	int emp_Id;
	String empName;
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="employee")
	List<Project>project;
	
	public Employee(int emp_Id, String empName) {
		super();
		this.emp_Id = emp_Id;
		this.empName = empName;
	}
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmpName() {
		return empName;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee() {
		super();
	}

}
