package com.code.demo;
import com.code.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class ReadOrderDetails {
	SessionFactory sessionFactory;
	public ReadOrderDetails(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		OrderDetails orderDetails = session.get(OrderDetails.class, 3);
		
		if(orderDetails==null) {
			System.out.println("The id does not exisy in the table");
			return;
		}
		
		System.out.println(orderDetails.toString());
		
		session.close();
	}

}
