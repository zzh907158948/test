//Fig 6.16:FibonacciTest.java
//Recursive fibonacci method 

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FibonacciTest extends JApplet implements ActionListener{
	JLabel numberLabel,resultLabel;
	JTextField numberField,resultField;
	
	//set up applet's GUI
	public void init()
	{
		//obtain content pane and set its layout to FlowLayout
		Container container=getContentPane();
		container.setLayout(new FlowLayout());
		 
		//create numberLabel and attach it to content pane
		numberLabel=new JLabel("Enter an integer and press Enter");
		container.add(numberLabel);
		
		//create numberField and attach it content pane
		numberField=new JTextField(10);
		container.add(numberField);
		
		//register this applet as numberField's ActionListener
		numberField.addActionListener(this);
		
		//create resultLabel and attach it to content pane
		resultLabel=new JLabel("Fibolacci value is ");
		container.add(resultLabel);
		
		//create numberField ,make it uneditable
		//and attach it to content pane
		resultField=new JTextField(15);
		resultField.setEditable(false);
		container.add(resultField);
		
	}//end method init
	
	//obtain use input and call method fibonacci
	public void actionPerformed(ActionEvent event){
		long number,fibonacciValue;
		
	//obtain user's input and convert to long 
	number =Long.parseLong(numberField.getText());
	 showStatus("Calculationg...");
	 
	 //calculate fibonacci value for number user input
	 fibonacciValue=fibonacci(number);
	  
	 //indicate processing complete and display result
	 showStatus("Done");
	 resultField.setText(Long.toString(fibonacciValue));
	 
	}  //end method actionPerformed
	
	//recursive declaration of method fibonacci
	public long fibonacci(long n) {
		//base case
		if(n==0||n==1)
			return n;
		//recursisve step
		else
			return fibonacci(n-1)+fibonacci(n-2);
		
		}  //end method fibonacci
	
}  //end class FibonacciTest
