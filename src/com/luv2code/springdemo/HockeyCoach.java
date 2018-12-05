package com.luv2code.springdemo;

public class HockeyCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public HockeyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "100 Slapshots";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
