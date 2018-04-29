// Fig. 5.19: LogicalOperators.java
// Logical operators

package pers.Zhuangzhihan5;
import javax.swing.*;

public class LogicalOperators {
	public static void main(String[] args) {
		// create JTextArea to display results
		JTextArea outputArea = new JTextArea(17, 20);
		
		// attach JTextArea to a JScrollPane so user can scroll results
		JScrollPane scoller = new JScrollPane(outputArea);
		
		// create truth table for && (condition AND) operator
		String output = "Condition AND (&&)" + 
				"\nfalse && false: " + (false && false) +
				"\nfalse && true: " + (false && true) +
				"\ntrue && false: " + (true && false) +
				"\ntrue && true: " + (true && true) ;
		
		// create truth table for || (condition OR) operator
		output += "\n\nCondition OR (||)" + 
				"\nfalse || false: " + (false || false) +
				"\nfalse || true: " + (false || true) +
				"\ntrue || false: " + (true || false) +
				"\ntrue || true: " + (true || true) ;
		
		// create truth table for & (boolean logical AND) operator
		output += "\n\nboolean logical AND (&)" + 
				"\nfalse & false: " + (false & false) +
				"\nfalse & true: " + (false & true) +
				"\ntrue & false: " + (true & false) +
				"\ntrue & true: " + (true & true) ;
		
		// create truth table for | (boolean logical OR) operator
		output += "\n\nboolean logical OR (|)" + 
				"\nfalse | false: " + (false | false) +
				"\nfalse | true: " + (false | true) +
				"\ntrue | false: " + (true | false) +
				"\ntrue | true: " + (true | true) ;
		
		// create truth table for ^ (boolean logical exclusive OR) operator
		output += "\n\nboolean logical exclusive OR (|)" + 
				"\nfalse ^ false: " + (false ^ false) +
				"\nfalse ^ true: " + (false ^ true) +
				"\ntrue ^ false: " + (true ^ false) +
				"\ntrue ^ true: " + (true ^ true) ;
		
		// create truth table for ! (logical negation) operator
		output += "\n\nlogical NOT (!)" + 
				"\n!false: " + (!false) +
				"\n!true: " + (!true) ;
		
		outputArea.setText(output); 	// Place results in JTextArea
		
		JOptionPane.showMessageDialog(null, scoller, "Truth Tables", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);	// terminate application
		
	}	// end main
	
}	// end class LogicalOperators
