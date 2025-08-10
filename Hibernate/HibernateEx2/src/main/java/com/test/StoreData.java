package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StoreData {
	public static void main(String []args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		
//		Creating Data in database
//		Employee obj= new Employee();
//		obj.setE_name("Harsh");   //id-1
//		obj.setE_Department("Developer");
////		
////		obj.setE_name("Harshpal");  //id-2
////		obj.setE_Department("Tester");
//		session.persist(obj);
		
		
		
		// updating Data for id=1
//		Employee obj1 = session.get(Employee.class, 1);
//		System.out.println(obj1.getE_id()+" "+obj1.getE_name()+" "+obj1.getE_Department());
//		obj1.setE_Department("Analyst");
//		obj1.setE_name("Shivani");
//		session.persist(obj1);
//		
//		// updating Data for id=2
//		Employee obj2 = session.get(Employee.class, 2);
//		System.out.println(obj2.getE_id()+" "+obj2.getE_name()+" "+obj2.getE_Department());
//		obj2.setE_Department("Backend");
//		obj2.setE_name("Radhika");
//		session.persist(obj2);
		
		//Deleting data
//		Employee obj =  session.get(Employee.class, 1); //id-1
//		session.remove(obj1);
//		
//		Employee obj3 =  session.get(Employee.class, 2); //id-2
//		session.remove(obj2);
//		
		
		
		t.commit();
		session.close();
		
		System.out.println("Done");
		
	}
	

}
