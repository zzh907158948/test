//Fig. 4.7: Average1.java
// Class-average program with counter-controlled repetition

package pers.Zhuangzhihan1234;
import javax.swing.JOptionPane;

public class Average1 {
	public static void main(String[] args) {
		int total;				// sum of grades input by user
		int gradeCounter;		// number of grade to be entered next
		int grade;				// grade value
		int average;			// average typed by user
		
		String gradeString;		// grade typed by user
		
		//initialization phase
		total = 0;				// initialize total
		gradeCounter = 1;		// initialize loop counter 
		
		// processing phase
		while (gradeCounter <= 10) {	//loop 10 times
			
			//prompt for input and read grade from user 
			gradeString = JOptionPane.showInputDialog(
					"Enter integer grade: ");
			//convert gradeString to int
			grade = Integer.parseInt(gradeString);
			
			total = total + grade;	//add grade to total
			gradeCounter = gradeCounter + 1;	// increment counter

		}// end while
		
		// termination phase 
		average = total / 10; //integer division
		
		//display averageof exam grades
		JOptionPane.showMessageDialog(null, "Class average is " + average,
				"Class Average", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);//terminate application
		
	}// end main

}//end class Average1
