//Fig. 4.9: Average2.java
// Class-average program with counter-controlled repetition

package pers.Zhuangzhihan1234;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Average2 {
	public static void main(String[] args) {
		int total;				// sum of grades input by user
		int gradeCounter;		// number of grade to be entered next
		int grade;				// grade value
		
		double average;			// average typed by user
		
		String gradeString;		// grade typed by user
		
		//initialization phase
		total = 0;				// initialize total
		gradeCounter = 0;		// initialize loop counter 
		
		// processing phase
		// get first grade from user
		gradeString = JOptionPane.showInputDialog(
				"Enter Integer Grade or -1 to Quit: ");
		
		// convert gradeString to int
		grade = Integer.parseInt(gradeString);
		
		// loop until sentinel value read from user
		while (grade != -1) {	//loop 10 times
			
			total = total + grade;	//add grade to total
			gradeCounter = gradeCounter + 1;	// increment counter
			
			// get next grade from user
			gradeString = JOptionPane.showInputDialog(
					"Enter Integer Grade or -1 to Quit: ");
			
			// convert gradeString to int
			grade = Integer.parseInt(gradeString);
		}// end while
		
		// termination phase 
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		
		// if user entered at least one grade...
		if (gradeCounter != 0) {
			// calculate average of all grades entered
			average = (double) total / gradeCounter;
			
			// display average with two digits of precision
			JOptionPane.showMessageDialog(null, 
					"Class average is " + twoDigits.format(average), 
					"Class Average", JOptionPane.INFORMATION_MESSAGE);
		} // end if part of if...else
		
		else // if no grades entered, output appropriate message
			JOptionPane.showMessageDialog(null, "No grades were entered", 
					"Class Average", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);//terminate application
		
	}// end main

}//end class Average2
