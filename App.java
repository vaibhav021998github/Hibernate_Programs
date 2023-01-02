package com.velocity.Mapping4;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration();
    	cf.configure("Hib4.cfg.xml"); 
    	SessionFactory sf=cf.buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	
    	Project project1=new Project();
    	project1.setP_Id(111);
    	project1.setP_Name("App Development");
    	
    	Project project2=new Project();
    	project2.setP_Id(121);
    	project2.setP_Name("Web Development");
    	
    	Employee emp1=new Employee();
    	emp1.setEmp_Id(151);
    	emp1.setEmpName("Narayan");
    	
    	Employee emp2=new Employee();
    	emp2.setEmp_Id(152);
    	emp2.setEmpName("Laxmi");
    	
    	Employee emp3=new Employee();
    	emp3.setEmp_Id(156);
    	emp3.setEmpName("RajaRam");
    	
    	List<Employee>list1=new ArrayList<Employee>();
    	list1.add(emp1);
    	list1.add(emp2);
    	
    	project1.setEmployee(list1);
    	
    	List<Employee>list2=new ArrayList<Employee>();
    	list2.add(emp1);
    	list2.add(emp3);
    	project2.setEmployee(list2);
    
    	
    	session.save(project1);
    	session.save(project2);
        
    	System.out.println("Program Terminate Successfully.... ");
    	session.getTransaction().commit();
    	session.close();
    	sf.close();
    }
}
