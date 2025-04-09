package com.code.demo;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.code.entity.*;

public class UpdateUsers {
	
	SessionFactory sessionFactory;
	public UpdateUsers(SessionFactory sessionFactory) {
		
		this.sessionFactory= sessionFactory;
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Users user1= session.get(Users.class, 4);
		user1.setUsername("Ade");
		user1.setEmail("ade@gmail.com");
		
		Users user2= session.get(Users.class, 5);
		
		user2.setEmail("jack@gmail.com");
		session.merge(user2);
		
		session.getTransaction().commit();
		session.close();
		
	}
	
	

}
