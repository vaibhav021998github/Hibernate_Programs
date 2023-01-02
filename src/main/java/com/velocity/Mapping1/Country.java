package com.velocity.Mapping1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Country {
@Id	
int country_Id;
String country_Name;
@OneToOne(cascade=CascadeType.ALL)
Capital capital;

public Capital getCapital() {
	return capital;
}
public void setCapital(Capital capital) {
	this.capital = capital;
}
public Country(int country_Id, String country_Name) {
	super();
	this.country_Id = country_Id;
	this.country_Name = country_Name;
}
public int getCountry_Id() {
	return country_Id;
}
public void setCountry_Id(int country_Id) {
	this.country_Id = country_Id;
}
public String getCountry_Name() {
	return country_Name;
}
public void setCountry_Name(String country_Name) {
	this.country_Name = country_Name;
}
public Country() {
	super();

}

}
