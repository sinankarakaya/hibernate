package com.sinan.hibernate_embedded_embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sinan.hibernate_embedded_embeddable.pojo.Address;
import com.sinan.hibernate_embedded_embeddable.pojo.User;

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
    		
    		user.setAddress(address);
    	session.save(user);
    	session.getTransaction().commit();
    }
}
