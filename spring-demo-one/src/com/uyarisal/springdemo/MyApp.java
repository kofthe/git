package com.uyarisal.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		
		Coach theCoach = new TrackCoach() ; //Hardcoded ba��ml�. Spring ile sadece konfigrasyon dosyas�n� de�i�tirerek
		//ana kodumda oynama yapmadan hangi t�r kod oldu�unu se�erek yazmaya ba�layabilirim.
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}



//