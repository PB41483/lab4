package tpsi.web;





public class Person  {

	private String firstName;
	private String lastName;
	private String emailAddress;

	public Person(String firstName, String lastName, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public String getemailAddress() {
		return emailAddress;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public void setemailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
	
	
}