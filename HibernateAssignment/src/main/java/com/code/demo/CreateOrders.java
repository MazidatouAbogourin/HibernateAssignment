package com.code.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.code.entity.*;
public class CreateOrders {

	SessionFactory sessionFactory;
	
	public CreateOrders(SessionFactory sessionFactory) {
		
//		this.sessionFactory = sessionFactory;
//		Session session = sessionFactory.getCurrentSession();
//		session.beginTransaction();
//		Users user = new Users("test","test","test@gmail.com","customer");
////		Orders order = new Orders("3/28/2025", 789, user);
//		
//		session.persist(user);
//		session.getTransaction().commit();
//		
//		session.close();
		
		
		this.sessionFactory=sessionFactory;
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Users user =new Users("test", "test", "test@gmail.com", "customer");
		Orders order = new Orders("12/12/23",  234.9, user);
		session.persist(user);
		session.persist(order);
		session.getTransaction().commit();
		session.close();
	}
	
	
}
