package com.sinan.hibernate_elementcollection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sinan.hibernate_elementcollection.pojo.Address;
import com.sinan.hibernate_elementcollection.pojo.User;

/**
 * @author Sinan Karakaya
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
    		User user = new User();
    		user.setUserName("sinan");
    		user.setUserSurname("karakaya");
    		
    		Address address = new Address();
    		address.setProvince("Kayseri");
    		address.setDistrict("Talas");
    		address.setNeighborhood("Mevlana");
    		
    		Address address2 = new Address();
    		address2.setProvince("Kayseri");
    		address2.setDistrict("Talas");
    		address2.setNeighborhood("Mevlana");
    		
    		user.getAddress().add(address);
    		user.getAddress().add(address2);
    		
    	session.save(user);
    	session.getTransaction().commit();
    }
}
