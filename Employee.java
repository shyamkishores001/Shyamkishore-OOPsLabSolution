package lab19une;

public class Employee {

String firstname;
String lastname;
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
public Employee(String firstname, String lastname) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
}
}
