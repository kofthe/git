import Entities.concrets.Customer;
import business.abstracts.CustomerService;
import business.concretes.CustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer mehmet = new Customer("Mehmet", "Arı", "1749545464851", "DESDEAD", "hqlmania@gmail.com")  ; 
		
		CustomerService customerService = (CustomerService) new CustomerManager(HibernateUserDao(), RegexManager() )  ; 
		customerService.signIn(mehmet); 
		customerService.signOut(mehmet);
		
	}

	private static Object RegexManager() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object HibernateUserDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
