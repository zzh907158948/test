// Fig. 2.10: Comparison.java 
// Compare integers using if statements, relational operators
// and equality operators.


// Java packages
package test;
import javax.swing.JOptionPane;

public class Comparison {
	
	// main method begins execution of Java application
	public static void main(String[] args) {
		String firstNumber;		// first String entered by user
		String secondNumber;	// second String entered by user
		String result; 			// a string containg the output
		
		int number1;		// first number to add
		int number2;		// second number to add
		
		// read in first number from user as a string
		firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
		
		// read in second number from user as a string
		secondNumber = 
			JOptionPane.showInputDialog("Enter second integer: ");
		
		// convert numbers from type String to type int
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		//initialize resulr to empty String
		result = "";
		
		if (number1 == number2)
			result = result + number1 + " == " + number2;
		
		if (number1 != number2)
			result = result + "\n" + number1 + " != " + number2;
		
		if (number1 < number2)
			result = result + "\n" + number1 + " < " + number2;
		 
		if (number1 > number2)
			result = result + "\n" + number1 + " > " + number2;
		
		if (number1 <= number2)
			result = result + "\n" + number1 + " <= " + number2;
		
		if (number1 >= number2)
			result = result + "\n" + number1 + " >= " +number2;
		
		//display result
		JOptionPane.showMessageDialog(null, result,
				"Comarison Results", JOptionPane.PLAIN_MESSAGE );
		
		System.exit(0);  //terminate application
	
	}// end method main

}// end class Addition 


