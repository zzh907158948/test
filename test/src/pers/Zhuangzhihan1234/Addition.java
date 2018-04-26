// Fig. 2.9: Addition.java 
// Addition Program that displays the sum of two numbers.

// Java packages
package pers.Zhuangzhihan1234;
import javax.swing.JOptionPane;

public class Addition {
	
	// main method begins execution of Java application
	public static void main(String[] args) {
		String firstNumber;		// first String entered by user
		String secondNumber;	// second String entered by user
		
		int number1;		// first number to add
		int number2;		// second number to add
		int sum;			// sum of number1 and number2
		
		// read in first number from user as a string
		firstNumber = JOptionPane.showInputDialog("Enter first integer");
		
		// read in second number from user as a string
		secondNumber = 
			JOptionPane.showInputDialog("Enter second integer");
		
		// convert numbers from type String to type int
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		// add numbers
		sum = number1 + number2;
		
		//display result
		JOptionPane.showMessageDialog(null, "The sum is " + sum,
				"Results", JOptionPane.PLAIN_MESSAGE );
		
		System.exit(0);  //terminate application with window
	
	}// end method main

}// end class Addition 


