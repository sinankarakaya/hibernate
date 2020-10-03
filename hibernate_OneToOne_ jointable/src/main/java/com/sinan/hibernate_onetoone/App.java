package com.sinan.hibernate_onetoone;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sinan.hibernate_onetoone.pojo.Address;
import com.sinan.hibernate_onetoone.pojo.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory =
    			new Configuration().configure().buildSessionFactory();	
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    		
    	Address address = new Address();
		address.setProvince("Kayseri");
		address.setDistrict("Talas");
		address.setNeighborhood("Mevlana");
		
		User newUser = new User();
		newUser.setUserName("sinan");
		newUser.setUserSurname("karakaya");
    	newUser.setAddress(address);
    	session.save(newUser);
    	
    	session.getTransaction().commit();
    	
    	
    }
}
