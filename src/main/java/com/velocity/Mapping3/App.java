package com.velocity.Mapping3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration();
    	cf.configure("Hib3.cfg.xml"); 
    	SessionFactory sf=cf.buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	Employee emp1=new Employee();
    	emp1.setEmp_Id(101);
    	emp1.setEmp_Name("Shiva");
    	
    	Employee emp2=new Employee();
    	emp2.setEmp_Id(102);
    	emp2.setEmp_Name("Girija");
    	
    	Employee emp3=new Employee();
    	emp3.setEmp_Id(221);
    	emp3.setEmp_Name("Vaibhav"); 
    	
    	Company company1=new Company();
    	company1.setCompany_id(221);
    	company1.setC_Name("IBM");
    	
    	Company company2=new Company();
    	company2.setCompany_id(251);
    	company2.setC_Name("Wipro");
    	
    	emp1.setCompany(company1);
    	emp2.setCompany(company1);
    	emp3.setCompany(company2);
    	
    	session.save(emp1);
    	session.save(emp2);
    	session.save(emp3);
    
    	System.out.println("Program Terminate Successfully.... ");
    	session.getTransaction().commit();
    	session.close();
    	sf.close();
    }
}
