
public class Gamer {
	int id ; 
	String firstname; 
	String lastname; 
	String nationalitiyId; 
	String userName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNationalitiyId() {
		return nationalitiyId;
	}

	public void setNationalitiyId(String nationalitiyId) {
		this.nationalitiyId = nationalitiyId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Gamer(int id, String firstname, String lastname, String nationalitiyId, String userName) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nationalitiyId = nationalitiyId;
		this.userName = userName;
	} 
	
}
