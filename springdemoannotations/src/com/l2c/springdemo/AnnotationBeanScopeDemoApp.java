package com.l2c.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("ttCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("ttCoach", Coach.class);
		
		//use methods on beans
		System.out.println(theCoach);
		
		System.out.println(alphaCoach);
		
		//close context
		context.close();

	}

}
