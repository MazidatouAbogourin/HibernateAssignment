package com.code.demo;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.code.entity.*;

public class CreateOrdersDetails {
	SessionFactory sessionFactory;
	
	public CreateOrdersDetails(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		Orders order1 = session.get(Orders.class, 4);
		Product product1 = session.get(Product.class, 1);
		OrderDetails orderDetails1 = new OrderDetails(2, 20, order1, product1);
		
		session.persist(orderDetails1);
		session.getTransaction().commit();
		
		session.close();
		System.out.println("Transaction successfully done");
	}

}
