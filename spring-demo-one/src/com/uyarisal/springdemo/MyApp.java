package com.uyarisal.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		
		Coach theCoach = new TrackCoach() ; //Hardcoded baðýmlý. Spring ile sadece konfigrasyon dosyasýný deðiþtirerek
		//ana kodumda oynama yapmadan hangi tür kod olduðunu seçerek yazmaya baþlayabilirim.
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}



//