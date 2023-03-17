package com.l2c.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		TrackCoach trackCoach = context.getBean("myCoach", TrackCoach.class);
		
		//call methods on the bean
		System.out.println(trackCoach.getDailyWorkout());
		
		// new method for fortune services
		System.out.println(trackCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
