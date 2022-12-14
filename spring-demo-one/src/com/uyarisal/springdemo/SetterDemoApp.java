package com.uyarisal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring configration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ; 
		//retrieve bean from spring container 
		CricketCoach theCoach = context.getBean("myCricketCoach" , CricketCoach.class);
		// call methots 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call new values - criketteki email ve team ismini yazdırıyorzu. 
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();
	}

}
