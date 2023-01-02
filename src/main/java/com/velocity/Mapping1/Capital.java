package com.velocity.Mapping1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Capital {
@Id
int capital_Id;
String capital_Name;
@OneToOne(cascade=CascadeType.ALL,mappedBy="capital")
Country country;
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
public int getCapital_Id() {
	return capital_Id;
}
public void setCapital_Id(int capital_Id) {
	this.capital_Id = capital_Id;
}
public String getCapital_Name() {
		return capital_Name;
}
public void setCapital_Name(String capital_Name) {
	this.capital_Name = capital_Name;
}
public Capital(int capital_Id, String capital_Name) {
		super();
this.capital_Id = capital_Id;
this.capital_Name = capital_Name;
}
public Capital() {
		super();
		
	}
	

}
