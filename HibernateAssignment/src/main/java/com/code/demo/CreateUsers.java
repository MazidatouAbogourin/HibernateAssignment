package com.code.demo;
import org.hibernate.*;
import com.code.entity.*;
public class CreateUsers {
	SessionFactory sessionFactory;
public CreateUsers(SessionFactory sessionFactory) {
	this.sessionFactory=sessionFactory;
	Session session = sessionFactory.getCurrentSession();
	session.beginTransaction();
	
//	Users user = new Users("Mazidatou", "mazi", "mazi@gmail.com", "ADMIN");
	
	Users user1= new Users("ab", "abc", "abc@gmail,com", "customer");
	session.persist(user1);
	
	Users user2= new Users("jack", "abc", "jack@gmail,com", "customer");
	session.persist(user2);
	
	Users user3= new Users("john", "smith", "john@gmail,com", "admin");
	session.persist(user1);
	
	session.getTransaction().commit();
	session.close();
	
}
}
