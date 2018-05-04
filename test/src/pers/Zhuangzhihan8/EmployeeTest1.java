// Fig. 8.13: EmployeeTest.java
// Test Employee class with static class variable,
// static class method, and dynamic memory.

package pers.Zhuangzhihan8;
import javax.swing.*;

public class EmployeeTest1 {
	
	public static void main(String[] args) {
		// prove that count is 0 before creating Employees
		String output = "Employees before instantiation: " +
				Employee1.getCount();
		
		// create two Employees; count should be 2
		Employee1 e1 = new Employee1("Susan", "Baker");
		Employee1 e2 = new Employee1("Bob", "Jones");
		
		// prove that count is 2 after creating two Employees
		output += "\n\nEmployees after instantiation: " +
				"\nvia e1.getCount(): " + e1.getCount() +
				"\nvia e2.getCount(): " + e2.getCount() +
				"\nvia Employee.getCount()" + Employee1.getCount();
		
		// get names of Employees
		output += "\n\nEmployee 1: " + e1.getFirstName() +
				" " + e1.getLastName() + "\nEmployee 2: " + 
				e2.getFirstName() + " " + e2.getLastName();
		
		// decrement reference count for each Employee object; in this 
		// example, there is only one reference to each Employee, so these
		// statements mark each Employee object for garbage collection
		e1 = null;
		e2 = null;
		
		System.gc(); // suggest call to garbage collector
		
		// show Employee count after calling garbage collector; count
		// displayed may be 0, 1 or 2 based on whether garbage collector
		// executes immediately and number of Employee objects collected
		output += "\n\nEmployees after System.gc(): " + 
				Employee1.getCount();
		
		JOptionPane.showMessageDialog(null, output,
				"Static Member", JOptionPane.INFORMATION_MESSAGE);
	
		System.exit(0);
		
	}
}// end class EmployeeTest1
