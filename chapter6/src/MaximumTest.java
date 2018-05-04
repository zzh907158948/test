//Fig 6.4:MaximumTest.java
//Finding the maximum of three floating-point numbers.

import java.awt.Container;
import javax.swing.*;

public class MaximumTest extends JApplet {
	
	//initialize applet by obtaining user input and creating GUI
	public void init()
	{
		//obtain user input
		String s1=JOptionPane.showInputDialog(
				"Enter first floating-point value");
		String s2=JOptionPane.showInputDialog(
				"Enter second floating-point value");
		String s3=JOptionPane.showInputDialog(
				"Enter third floating-point value");
		
		//convert user input to double values
		double number1=Double.parseDouble(s1);
		double number2=Double.parseDouble(s2);
		double number3=Double.parseDouble(s3);
		
		double max=maximum(number1,number2,number3);  //call method maximum
		
		//create JTextAreato diaplay results
		JTextArea outputArea=new JTextArea();
		
		//display numbers and maximum value
		outputArea.setText("number1: "+number1+"\nnumber2: "+number2
				+"\nnumber3: "+number3+"\nmaximum is: "+max);
		
		//get applet's GUIcomponent display area
		Container container=getContentPane();
		 
		//attach outputArea to Container c
		container.add(outputArea);
		
	}//end method init
	
	//maximum method uses Math class method max to help
	public double maximum(double x,double y,double z)
	{
		return Math.max(x,Math.max(y, z));
		
	}  //end method maximum

}  //end class Maximum
