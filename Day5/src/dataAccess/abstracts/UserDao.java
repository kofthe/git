package dataAccess.abstracts;

import Entities.concrets.Customer;

public interface UserDao {
		public void signIn(Customer customer) ; 
		public void signOut(Customer customer)  ; 
		public void update(Customer customer) ; 
		
}
