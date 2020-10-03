package com.sinan.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sinan.orm.pojo.User;

/**
 * Sinan Karakaya!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	User user = new User();
    	user.setUserName("sinan");
    	user.setUserSurname("karakaya");
    	
    	SessionFactory sessionFactory =
    			new Configuration().configure().buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    		session.save(user);
    	session.getTransaction().commit();
    	session.close();
    }
}
