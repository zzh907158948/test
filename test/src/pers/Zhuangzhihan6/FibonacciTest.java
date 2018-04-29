// Fig. 6.16: FibonacciTest.java
// Recursive fibonacci method

package pers.Zhuangzhihan6;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class FibonacciTest  extends JApplet implements ActionListener{
	JLabel numberLabel, resultLabel;
	JTextField numberField, resultField;
	
	// set up applet's GUI
	public void init(){
		// obtain content pane and set its layout to FlowLayout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		// create numbetField and attach it to content pane
		numberField = new JTextField(10);
		container.add(numberField);
		
		// register this applet as numberField's ActionListener
		numberField.addActionListener(this);
		
		// create resultLabel and attach it to content pane
		resultLabel = new JLabel("Fibonacci value is ");
		container.add(resultLabel);
		
		// create numberField ,make it uneditable
		// and attach it to content pane
		resultField = new JTextField(15);
		resultField.setEditable(false);
		container.add(resultField);
		
	}// end method init
	
	// obtain user input and call method fibonacci 
	public void actionPerformed(ActionEvent event){
		long number, fibonacciValue;
		
		// obtain user's input and convert to long
		number = Long.parseLong(numberField.getText());
		
		showStatus("Calculating ...");
		
		// calculate fibonacci value for number user input
		fibonacciValue = fibonacci(number);
		
		// indicate processing complete and display result
		showStatus("Done.");
		resultField.setText(Long.toString(fibonacciValue));
		
	}// end method actionPerformed
	
	// recursive declaration of method fibonacci
	public long fibonacci(long n){
		// base case 
		if( n == 0 || n == 1)
			return n;
		
		// recursive step
		else 
			return fibonacci(n - 1) + fibonacci(n - 2);
		
	}//end method fibobacci 
	
}// end class FibonacciTest


























