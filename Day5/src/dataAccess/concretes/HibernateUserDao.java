package dataAccess.concretes;

import Entities.concrets.Customer;
import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao{

	@Override
	public void signIn(Customer customer) {
		System.out.println("Sisteme giriş yapıldı");
		
	}

	@Override
	public void signOut(Customer customer) {
		System.out.println("Sistemden çıkış yapıldı");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Sİsteme girilen bilgiler güncellendi");
		
	}
	

}
