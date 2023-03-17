package com.l2c.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//Check if same bean
		boolean result = (theCoach == alphaCoach);
		
		//print out result
		System.out.println("\nPointing to the same object " + result);
		
		System.out.println("\nMemory location for the theCoach: " + theCoach);
		
		System.out.println("\nMemory location for the alphaCoach: " + alphaCoach + "\n");
		
		//close the context
		context.close();
		
	}

}
