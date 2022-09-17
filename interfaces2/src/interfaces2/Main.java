package interfaces2;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger() , new EmailLogger() } ;
		 
		CustomerManager customerManager = new CustomerManager(loggers)  ;  
		
		Customer mehmet = new Customer(1,"Mehmet" , "ARI") ; 
		
		customerManager.add(mehmet);

	}

}
