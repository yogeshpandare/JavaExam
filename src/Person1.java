
public class Person1 {
	private String firstName;
	private String lastName;

	Person1(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	}

	String getFullName() {
		return firstName + " " + lastName;
	}
}
