package com.code.demo;
import com.code.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class DeleteOrderDetails {
	SessionFactory sessionFactory;
	public DeleteOrderDetails(SessionFactory sessionFactory) {
		
		this.sessionFactory= sessionFactory;
		Session session= sessionFactory.getCurrentSession();
		
		
		session.beginTransaction();
		
		OrderDetails itemToBeDeleted = session.get(OrderDetails.class, 2);
		if(itemToBeDeleted==null) {
			System.out.println("an item was not found");
			return;
			
		}
		
		
		session.remove(itemToBeDeleted);
		session.getTransaction().commit();
		System.out.println("an item was deleted successfully");
	}

}
