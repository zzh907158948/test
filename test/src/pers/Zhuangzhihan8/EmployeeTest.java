// Fig. 8.11: EmployeeTest.java
// Demonstrating an object with a member object. 

package pers.Zhuangzhihan8;

import javax.swing.JOptionPane;

public class EmployeeTest {
	public static void main(String[] args) {
		Date birth = new Date(7, 24, 1949);
		Date hire = new Date(3, 12, 1988);
		Employee employee = new Employee("Bob", "Jones", birth, hire);
		
		JOptionPane.showMessageDialog(null, employee.toEmployeeString(), 
				"Testing Class Emolyee", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	}
	
}// end class EmployeeTest
