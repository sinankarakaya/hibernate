package com.sinan.hibernate_onetomany_manytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sinan.hibernate_onetomany_manytoone.pojo.Role;
import com.sinan.hibernate_onetomany_manytoone.pojo.User;

/**
 * @author sinan
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
	    	Role role = new Role();
	    	role.setRole("admin");
	    	session.save(role);
    	session.getTransaction().commit();
    	
    	session = sessionFactory.openSession();
    	session.beginTransaction();
	    	User user = new User();
	    	user.setName("sinan");
	    	user.setSurname("karakaya");
	    	user.setRole(role);
	    	session.save(user);
    	session.getTransaction().commit();
      
    	//User user = session.get(User.class, 2);
    }
}
