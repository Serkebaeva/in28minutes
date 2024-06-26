package person;

public class Person extends Object {
	private String name;
	private String email;
	private String phoneNumber;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// print
	public String toString() {
		return String.format("name: %s, email: %s, phone Number: %s", name, email, phoneNumber);
	}

}


