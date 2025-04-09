package com.code.demo;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.code.entity.*;

public class CreateProduct {
  SessionFactory sessionFactory;
  
  
 public CreateProduct(SessionFactory sessionFactory) {
	 this.sessionFactory= sessionFactory;
	 Session session = sessionFactory.getCurrentSession();
	 session.beginTransaction();
	 Category category=session.get(Category.class, 1);
	 System.out.println(category);
	 Product product1 = new Product("Things", 20, 5, category );
	 
	 session.persist(product1);
	 session.getTransaction().commit();
	 session.close();
	 
 }
  
}
