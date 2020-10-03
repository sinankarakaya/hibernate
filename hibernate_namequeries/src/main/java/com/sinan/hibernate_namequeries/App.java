package com.sinan.hibernate_namequeries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sinan.hibernate_namequeries.pojo.User;

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
    		User newUser = new User();
    		newUser.setUserName("sinan");
    		newUser.setUserSurname("karakaya");
    	session.save(newUser);
    	session.getTransaction().commit();
    	
    	List<User> query = session.createNamedQuery("getAllUser", User.class).getResultList();
    	for (User user : query) {
			System.out.println(user.getUserName());
		}
    	
    	List<User> query2 = session.createNamedQuery("user.username", User.class)
    			.setParameter("username", "sinan").getResultList();
    	for (User user : query2) {
			System.out.println(user.getUserName());
		}
    	
    	List<User> query3 = session.createNamedQuery("user.surname", User.class)
    			.setParameter("usersurname", "karakaya").getResultList();
    	for (User user : query3) {
			System.out.println(user.getUserName());
		}
    }
}
