package com.velocity.Mapping3;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Employee {
@Id
int emp_Id;
String emp_Name;
@ManyToOne(cascade=CascadeType.ALL)
Company company;
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmp_Id() {
	return emp_Id;
}
public void setEmp_Id(int emp_Id) {
	this.emp_Id = emp_Id;
}
public String getEmp_Name() {
	return emp_Name;
}
public void setEmp_Name(String emp_Name) {
	this.emp_Name = emp_Name;
}
public Employee(int emp_Id, String emp_Name) {
	super();
	this.emp_Id = emp_Id;
	this.emp_Name = emp_Name;
}



}
