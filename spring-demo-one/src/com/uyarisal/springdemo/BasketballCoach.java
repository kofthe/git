package com.uyarisal.springdemo;

public class BasketballCoach implements Coach{

	//define a private field for the dependency 
	private FortuneService fortuneService; 
	
	//define constructor for dependency injection 
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService ;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "�al�� ewlad�m �al�� y���lma ewlad�m";
	}

	@Override
	public String getDailyFortune() {

//use my fortune service to a get fortune 
		
		return fortuneService.getFortune();
	}

}
