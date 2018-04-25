// Fig. 3.13: AdditionApplet.java
// Adding two floating-point numbers.


//Java packages
package pers.Zhuangzhihan;
import java.awt.Graphics;	// import class Graphics
import javax.swing.*;	// import package javax.swing

public class AdditionApplet extends JApplet{
	double sum;	// sum of values entered by user
	
	// initialize applet by obtaining values from user
	public void init() {
		String firstnumber;	// first string entered by user	
		String secondnumber;	// second string entered by user
		
		double number1;	// first number to add
		double number2;	// second number to add
		
		//obtain first number from user 
		firstnumber = JOptionPane.showInputDialog(
				"Enter first floating-point value");
		
		//obtain second number from user 
				secondnumber = JOptionPane.showInputDialog(
						"Enter second floating-point value");
		// convert numbers from type String to type double
		number1 = Double.parseDouble(firstnumber);
		number2 = Double.parseDouble(secondnumber);
		
		// add numbers
		sum = number1 + number2;
						
	}// end method init
	
	// draw results in a rectangle on applet's background
	public void paint(Graphics g) {
		// call superclass version of method paint
		super.paint(g);
		
		// draw rectangle starting from (15,10) that is 270
		// pixels wide and 20 pixels tall
		g.drawString("The sum is " + sum, 25, 25);
		
	}// end method paint
	
}	//end class AdditionApplet
