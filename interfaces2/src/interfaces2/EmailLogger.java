package interfaces2;

public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("E-Mail Gönderildi " + message) ;  
		
		
	} 
	

}
