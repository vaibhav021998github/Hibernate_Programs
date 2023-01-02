package com.velocity.Mapping3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Company {
@Id
int company_id;
@Column(name="Company_Name")
String c_Name;

public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
public String getC_Name() {
	return c_Name;
}
public void setC_Name(String c_Name) {
	this.c_Name = c_Name;
}
public Company() {
	super();
	// TODO Auto-generated constructor stub
}
public Company(int company_id, String c_Name) {
	super();
	this.company_id = company_id;
	this.c_Name = c_Name;
}
}
