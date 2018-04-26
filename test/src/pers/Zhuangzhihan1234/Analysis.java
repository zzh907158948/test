//Fig. 4.11: Analysis.java
// Analysis of examination results.

package pers.Zhuangzhihan1234;
import javax.swing.JOptionPane;

import java.security.spec.PSSParameterSpec;
import java.text.DecimalFormat;

public class Analysis {
	public static void main(String[] args) {
		// initializing variables in declarations
		int passes = 0;			// number of passes
		int failures = 0;				// number of failures
		int studentCounter = 1;		// student counter 
		int result;				// one exam result
		
		String input;			// user-entered value
		String output; 			// output string

		// process 10 students using counter-controlled loop
		while (studentCounter <= 10) {
			
			// prompt user for input and obtain value from user
			input = JOptionPane.showInputDialog(
					"Enter result(1 = pass, 2 = fail): ");
			
			// convert result to int
			result = Integer.parseInt(input);
			// if result 1, increment passes; if...else nested in while
			if (result == 1) 
				passes = passes + 1;
			else // if result not 1, increment failures
				failures = failures + 1;
				
			// increment studentCounter so loop eventually terminates
			studentCounter = studentCounter + 1;
			
		}// end while
		
		// termination phase; prepare and display results
		output = "Passed: " + passes + "\nFailed: " + failures;
		
		// determine whether more than 8 students passed
		if (passes > 8) 
			output = output + "\nRaise Tuition";
		JOptionPane.showMessageDialog(null, output,
				"Analysis of Examination Results",
				JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);//terminate application
		
	}// end main

}//end class Analysis
