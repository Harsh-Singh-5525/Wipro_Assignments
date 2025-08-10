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
		
		
//		Inserting Data in database
//
//		Student obj= new Student();
//		obj.setStd_name("Harsh");   //id-1
//		obj.setStd_city("Sre");
//		
//		obj.setStd_name("Harshpal");  //id-2
//		obj.setStd_city("Dehradun");
//		session.persist(obj);
		
		
		
		// updating Data for id=1
		Student obj1 = session.get(Student.class, 1);
		System.out.println(obj1.getId()+" "+obj1.getStd_name()+" "+obj1.getStd_city());
		obj1.setStd_city("Patna");
		obj1.setStd_name("Shivani");
		session.persist(obj1);
		
		// updating Data for id=2
		Student obj2 = session.get(Student.class, 2);
		System.out.println(obj2.getId()+" "+obj2.getStd_name()+" "+obj2.getStd_city());
		obj2.setStd_city("Lucknow");
		obj2.setStd_name("Radhika");
		session.persist(obj2);
		
		t.commit();
		session.close();
		
		System.out.println("Done");
		
	}
	

}
