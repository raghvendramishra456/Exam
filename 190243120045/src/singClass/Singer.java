package singClass;

public class Singer {
	
	private String firstname;
	private String lastname;
	private String dob;
	private String address;
	
	
	public Singer() {
		super();
		// TODO Auto-generated constructor stub
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


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Singer(String firstname, String lastname, String dob, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.address = address;
	}
	
	

}
