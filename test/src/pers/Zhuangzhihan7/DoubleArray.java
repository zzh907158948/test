// Fig. 7.15: DoubleArray
// Two-dimensional array example.

package pers.Zhuangzhihan7;
import java.awt.*;
import javax.swing.*;

import pers.Zhuangzhihan1234.Average1;
import pers.Zhuangzhihan6.MaximumTest;

public class DoubleArray extends JApplet {
	int grades[][] = {
			{77, 68, 86, 73},
			{96, 87, 89, 81},
			{70, 90, 86, 81}};
	
	int students, exams;
	String output;
	JTextArea outputArea;
	
	// initialize fields
	public void init() {
		students = grades.length; 	// number of students
		exams = grades[0].length;	// number of exams
		
		// create JTextArea and attach to applet
		outputArea =new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		// build output string
		output = "The array is:\n";
		buildString();
		
		// call methods minimum and maximum
		output += "\n\nLowest grade: " + minimum() + 
				"\nHightest grade: " + maximum() + "\n";
		
		// call method average to calculate each student's average
		for (int counter = 0; counter < students; counter++) {
			output += "\nAverage for student " + counter + " is " +
					average(grades[counter]);	// pass one row of array grades
		}
		
		// change outputArea's display font
		outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		
		// place output string in outputArea
		outputArea.setText(output);
		
	}// end method init
	
	// find minimum grade
	public int minimum() {
		// assume first element of grades array is smallest
		int lowGrade = grades[0][0];
		
		// loop through rows of grades array
		for(int row = 0; row < students; row++)
			
			// loop through column of grades array
			for(int column = 0; column < exams; column++)
				
				// if grade is less than lowGrade, assign it to lowGrade
				if(grades[row][column] < lowGrade)
					lowGrade = grades[row][column];
		
		return lowGrade;
	}// end method minimum
	
	// find maximum grade
	public int maximum() {
		// assume first element of grades array is largest
		int highGrade = grades[0][0];
		
		// loop through rows of grades array
		for(int row = 0; row < students; row++)
			
			// loop through column of grades array
			for(int column = 0; column < exams; column++)
				
				// if grade is greater than highGrade, assign it to highGrade
				if(grades[row][column] > highGrade)
					highGrade = grades[row][column];
		
		return highGrade;
	}// end method maximum
	
	
	//determine average grade for particular student (or set of grades)
	public double average(int setOfGrades[]) {
		int total = 0;	// initialize total
		
		// sum grades for one student
		for (int counter = 0; counter < setOfGrades.length; counter++) 
			total += setOfGrades[counter];
		
		// return average of grades
		return (double)total / setOfGrades.length;
		
	}// end method average
	
	// build output string
	public void buildString() {
		output += "          ";// used to align column heads
		
		// create column heads
		for (int counter = 0; counter < exams; counter++) 
			output += "[" + counter + "]  ";
		
		// create rows/columns of text representing array grades
		for (int row = 0; row < students; row++) {
			output += "\ngrades[" + row + "]  ";
			
			for (int column = 0; column < exams; column++) {
				output += grades[row][column] + "   ";
			}
		}
		
	}// end method buildString
	
}// end class DoubleArray

















