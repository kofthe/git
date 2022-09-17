package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entities.concrets.Customer;

public class RegexManager implements RegexService{

	@Override
	public boolean checkValid(Customer customer) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(customer.getEmail());
		System.out.println(customer.getEmail() +" : "+ matcher.matches());
		boolean result = matcher.matches();
		return false ; 
	}
		
}
