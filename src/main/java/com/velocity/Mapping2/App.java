package com.velocity.Mapping2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration();
    	cf.configure("Hib2.cfg.xml"); 
    	SessionFactory sf=cf.buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	Department dm1=new Department();
    	dm1.setdId(1);
    	dm1.setdName("Account");
    	
    	Department dm2=new Department();
    	dm2.setdId(2);
    	dm2.setdName("Development");
    	
    	Employee emp1=new Employee();
    	emp1.setEmpId(1);
    	emp1.setEmpName("Ganesh");
    	emp1.setMobNum("9999999999");
    	dm1.getEmp().add(emp1);
    	
    	Employee emp2=new Employee();
    	emp2.setEmpId(2);
    	emp2.setEmpName("Shivshambhu");
    	emp2.setMobNum("11111111111");
    	dm1.getEmp().add(emp2);
    	
    	Employee emp3=new Employee();
    	emp3.setEmpId(3);
    	emp3.setEmpName("Vaibhav");
    	emp3.setMobNum("2121212121");
    	dm2.getEmp().add(emp3);
    	
    	session.save(dm1);
    	session.save(dm2);
    	
    	session.getTransaction().commit();
    	session.close();
    	sf.close();
    }
}
