package com.l2c.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TtCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TtCoach() {
		System.out.println("in constructor");
	}
	
	//define a setter method for injection
//	@Autowired
//	public void randomMethodBru(FortuneService theFortuneService) {
//		System.out.println("in setter");
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Already a god chill";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
