package Assignment2.ExerciseOne;

public abstract class Employee implements Payable {
	private String ssn;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String phone;
	private String email;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String ssn, String firstName, String lastName) {
		super();
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
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
	
	public void display() {
		String result = "";
		result += "Name: " + this.firstName + " " + this.lastName + "\n";
		result += "Email: " + this.email + "\n";
		result += "Birth: " + this.birthDate + "\n";
		result += "Phone: " + this.phone + "\n";
		System.out.println(result);
	}
	
}
