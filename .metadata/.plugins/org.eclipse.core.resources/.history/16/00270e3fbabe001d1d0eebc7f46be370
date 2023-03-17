package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//create student object
			System.out.println("Creating student object");
			Student tempStudent = new Student("Who", "Knows", "whoknwwws@goat.com");
			
			//start transaction
			session.beginTransaction();
			
			//save student object
			System.out.println("Saving goat");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			//find student's primary key
			System.out.println("Saved student. Id: " + tempStudent.getId());
			
			// get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on id
			System.out.println("Getting student with id: " + tempStudent.getId());
			Student myStudent = session.get(Student.class, tempStudent.getId());
			myStudent.setFirstName("GG");
			System.out.println(myStudent);
			
			//commit
			session.getTransaction().commit();
			
			System.out.println("Done...");
			
		}
		finally {
			factory.close();
		}

	}

}
