package com.l2c.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard ass 5k bruh";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just DO IT: " + fortuneService.getFortune();
	}
	
	//add init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}

}
