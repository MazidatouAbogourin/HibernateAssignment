package com.code.demo;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.code.entity.*;
import java.util.List;
public class ReadCategory {
	SessionFactory sessionFactory;
	
	public ReadCategory(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		List<Users> users = session.createQuery("from Users").getResultList();
		for(Users user: users) {
			System.out.println(user);
		}
		
		session.close();
		
	}

}
