package ToStringOverriding;

public class Person {
	String firstName;
	String lastName;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "firstName=" + firstName +" "+ ", lastName=" + lastName ;
	}
	
	

}
