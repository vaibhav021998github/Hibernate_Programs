package com.velocity.Mapping2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Department {
@Id
@Column(name="Department_Id")
int dId;
@Column(name="Department_Name")
String dName;
@OneToMany(cascade=CascadeType.ALL)
List<Employee>emp=new ArrayList<Employee>();

public List<Employee> getEmp() {
	return emp;
}
public void setEmp(List<Employee> emp) {
	this.emp = emp;
}
public int getdId() {
	return dId;
}
public void setdId(int dId) {
	this.dId = dId;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int dId, String dName) {
	super();
	this.dId = dId;
	this.dName = dName;
}

}
