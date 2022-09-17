package interfacesnew;

public class CustomerManager {
	// i kodları yazılırl 
	private ICustomerDal customerDal;
	
	
	public CustomerManager(ICustomerDal customerDal) {
		
		this.customerDal = customerDal ; 
	}
	
	public void add() {
		customerDal.Add() ; 
		} 
	
		
	
		
}
