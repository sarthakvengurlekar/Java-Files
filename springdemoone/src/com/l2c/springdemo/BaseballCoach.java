package com.l2c.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency injection
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 minutes on batting practice bruh";
		
	}

	@Override
	public String getDailyFortune() {
		//use fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
