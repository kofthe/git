package com.uyarisal.springdemo;

public class CricketCoach implements Coach{
	
	
	private String email ; 
	private String team ; 
	
	
	private FortuneService fortuneService ; 
	
	//create no args constructor 
	public CricketCoach() {
		System.out.println("Cricketcoach: no arg constructor i�inde oldu�unu belirtim.");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter inj kulland�k buraday�z o y�zden.");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "S�k� TuTunun �ocuklar U�u�a ge�iyoruz wuhu";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("team ismi verildi");
		this.team = team;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println("e mail adresi tan�mland�. set mail adress");
		this.email = email;
	}

}
