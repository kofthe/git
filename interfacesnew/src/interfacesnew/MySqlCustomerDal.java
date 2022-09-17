package interfacesnew;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
// Data Access Layer - Veri tabanı operasyonları buraya yazılılır.
	@Override
	public void Add() {
		System.out.println("Veri Tabanına Loglandı (MySql)");
		
	}

	@Override
	public void AddCustomer() {
		System.out.println("Müşteri Veri Tabanına Eklendi + " );
		
	}
			
	
}
