// Fig. 8.10: Employee.java
// Employee class declaration

package pers.Zhuangzhihan8;

public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	// constructor to initialize name, birth date and hire date
	public Employee(String first, String last, Date dateOfBirth,
			Date dateOfHire) {
		firstName = first;
		lastName = last;
		birthDate = dateOfBirth;
		hireDate = dateOfHire;	
	}
	
	// convert Employee to String format
	public String toEmployeeString() {
		return lastName + ", " + firstName +
				" Hired: " + hireDate.toDateString() + 
				" Birthday: " + birthDate.toDateString();
	}
	
}// end class Employee
