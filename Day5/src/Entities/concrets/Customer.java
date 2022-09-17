package Entities.concrets;

public class Customer {
	private String name ; 
	private String lastName ; 
	private String identitiy  ; 
	private String password ;
	private String email ; 
	public Customer(String name, String lastName, String identitiy, String password, String email) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.identitiy = identitiy;
		this.password = password;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentitiy() {
		return identitiy;
	}

	public void setIdentitiy(String identitiy) {
		this.identitiy = identitiy;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 
	
}
