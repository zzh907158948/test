// Fig. 7.10: BinarySearch.java
// Binary search of an array

package pers.Zhuangzhihan7;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

import javax.swing.*;

public class BinarySearch extends JApplet implements ActionListener {
	
	JLabel enterLabel, resultLabel;
	JTextField enterField, resultField;
	JTextArea output;
	
	int array[];
	String display = "";
	
	// set up applet's GUI 
	public void init() {
		
		// get content pane and set its layout to FlowLayout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		// set up JLabel and JTextFeild for user input
		enterLabel = new JLabel("Enter integer search key");
		container.add(enterLabel);
		
		enterField = new JTextField(10);
		container.add(enterField);
		
		// register this applet as enterField's action listener
		enterField.addActionListener(this);
		
		// set up JLabel and JTextFeild for user result
		resultLabel = new JLabel("Result");
		container.add(resultLabel);
		
		resultField = new JTextField(20);
		resultField.setEditable(false);
		container.add(resultField);
		
		// set up JTextArea for displaying comparison data
		output = new JTextArea(6, 60);
		output.setFont(new Font("Monospaced", Font.PLAIN, 12));
		container.add(output);
		
		// create array and fill with even integers 0 to 28
		array = new int[15];
		
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 * counter;
		}
		
	} // end method init

	// obtain user input and call method binarySearch
	public void actionPerformed(ActionEvent actionEvent) {
		// input also can be obtained with enterFeild.getText()
		String searchKey = actionEvent.getActionCommand();
		
		// initialize display string for new search 
		display = "Portions of array searched\n";
		
		// perform binary search
		int element = binarySearch(array, Integer.parseInt(searchKey));
		
		output.setText(display);
		
		// display search result
		if (element != -1) {
			resultField.setText("Found value in element " + element);
		}else {
			resultField.setText("Value not found");
		}
		
	}// end method actionPerformed

	public int binarySearch(int[] array2, int key) {
		
		int low = 0;	// low element index
		int high = array2.length - 1; // high element index
		int middle; 				// middle element index
		
		// loop until low index is greater than high index 
		while (low <= high) {
			middle = (low + high) / 2; // determine middle index
			
			// display subset of array elements used in this
			// iteration of binary search loop
			buildOutput(array2, low, middle, high);
			
			// if key matches middle element, return middle location
			if(key == array2[middle])
				return middle;
			
			// if key less than middle element, set new high element
			else if(key < array2[middle])
				high = middle - 1;
			
			// key greater than middle element, set new low element
			else {
				low = middle + 1;
			}
			
		}// end while
		
		return -1;	// key not found

	}// end method binarySearch
	
	// build row of output showing subset of array elements 
	// currently being processed
	void buildOutput(int array3[], int low, int middle, int high)
	{
		// create 2-digit integer format 
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		// loop through array elements
		for (int counter = 0; counter < array3.length; counter++) {
			
			// if counter outside current array subset, append 
			// padding spaces to String display
			if (counter < low || counter > high) 
				display += "   ";
		
			// if middle element, append element to String display 
			// followed by asterisk (*) to indicate middle element
			else if(counter == middle)
				display += twoDigits.format(array3[counter]) + "* ";
			
			else 
				display += twoDigits.format(array3[counter]) + "  ";
		
		}// end for
		
		display += "\n";
		
	}// end method buildOutput

}// end class BinarySearch

























