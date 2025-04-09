package com.code.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.entity.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
   SessionFactory sessionFactory= 	new Configuration().configure("hibernate.cfg.xml")
    						.addAnnotatedClass(Category.class)
    						.addAnnotatedClass(OrderDetails.class)
    						.addAnnotatedClass(Orders.class)
    						.addAnnotatedClass(Product.class)
    						.addAnnotatedClass(Users.class)
    						.buildSessionFactory();
//   new CreateCategory(sessionFactory);
//   new CreateUsers(sessionFactory);
//   new CreateOrders(sessionFactory);  
//   new CreateProduct(sessionFactory);
//   new CreateOrdersDetails(sessionFactory);
//   new ReadCategory(sessionFactory);
//   new ReadOrderDetails(sessionFactory);
//   new UpdateUsers(sessionFactory);
   new DeleteOrderDetails(sessionFactory);
    }
}
