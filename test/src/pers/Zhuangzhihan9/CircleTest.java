// Fig. 9.7: CircleTest.java
// Testing class Circle.

package pers.Zhuangzhihan9;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CircleTest {
	
	public static void main(String[] args) {
		Circle circle = new Circle(37, 43, 2.5);	// create Circle object
		
		// get Circle's initial x-y coordinates and radius
		String output = "X coordinate is " + circle.getX() +
				"\nY coordinate is " + circle.getY() + 
				"\nRadius is " + circle.getRadius();
		
		circle.setX(35);	// set new x-coordinate
		circle.setY(20); 	// set new y-coordinate
		circle.setRadius(4.25); // set new radius
		
		// get String representation of new circle value
		output += "\n\nThe new location and radius of circle are\n" +
				circle.toString();
		
		// format floating-point values with 2 digits of precision
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		
		// get Circle's diameter
		output += "\nDiameter is " +
				twoDigits.format(circle.getDiameter());
		
		// get Circle's circumference
		output += "\nCircumference is " +
				twoDigits.format(circle.getCircumference());
		
		// get Circle's are
		output += "\nArea is " + twoDigits.format(circle.getArea());
		
		JOptionPane.showMessageDialog(null, output);// display output
		
		System.exit(0);
		
	}// end main
	
}// end class CircleTest
