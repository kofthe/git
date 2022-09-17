package business.abstracts;

import Entities.concrets.Customer;

public interface CustomerService {
	void signIn(Customer customer) ; 
	void signOut(Customer customer) ;  
	void update(Customer customer) ; 
	
}	
