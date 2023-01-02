package com.velocity.Mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration();
    	cf.configure("Hib.cfg.xml"); 
    	SessionFactory sf=cf.buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	// this is the Example of One To One Mapping...
    	Capital capital1=new Capital();
    	capital1.setCapital_Id(1);
    	capital1.setCapital_Name("Delhi");
    	
    	Capital capital2=new Capital();
    	capital2.setCapital_Id(2);
    	capital2.setCapital_Name("Tokyo");
    	
    	Country country1=new Country();
    	country1.setCountry_Id(1);
    	country1.setCountry_Name("India");
    	
    	Country country2=new Country();
    	country2.setCountry_Id(2);
    	country2.setCountry_Name("Japan");
    
    
    	country1.setCapital(capital1);
    	country2.setCapital(capital2);
    
    	session.save(country1);
    	session.save(country2);
    	session.getTransaction().commit();
    	session.close();
    	sf.close();
        System.out.println( " Program Terminate Sucessfully...!" );
    }
}
