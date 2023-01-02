package com.velocity.Mapping4;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	@Column(name="Project_Id")
	int p_Id;
	@Column(name="Project_Name")
	String p_Name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<Employee>employee;

	public int getP_Id() {
		return p_Id;
	}

	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}

	public String getP_Name() {
		return p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int p_Id, String p_Name, List<Employee> employee) {
		super();
		this.p_Id = p_Id;
		this.p_Name = p_Name;
		this.employee = employee;
	}
	

}
