package com.code.demo;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import com.code.entity.*;
public class CreateCategory {
	
	SessionFactory sessionFactory;
	public CreateCategory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		//Create session object
		Session session = sessionFactory.getCurrentSession();
		//create the transaction object
		session.beginTransaction();
		//create the object of the object
		Category category = new Category("books", "all comics");
		//save the object
		session.persist(category);
		session.getTransaction().commit();	
		
		session.close();
		
		System.out.println("Instructor is create successfully ");
		
	}
	

}
