package com.uyarisal.springdemo;

public class CricketCoach implements Coach{
	
	
	private String email ; 
	private String team ; 
	
	
	private FortuneService fortuneService ; 
	
	//create no args constructor 
	public CricketCoach() {
		System.out.println("Cricketcoach: no arg constructor içinde olduðunu belirtim.");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter inj kullandýk buradayýz o yüzden.");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Sýký TuTunun Çocuklar Uçuþa geçiyoruz wuhu";
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
		System.out.println("e mail adresi tanýmlandý. set mail adress");
		this.email = email;
	}

}
