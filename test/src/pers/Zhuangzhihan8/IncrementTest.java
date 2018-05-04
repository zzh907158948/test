// Fig. 8.14: IncrementTest.java
// Initializing a final variable

package pers.Zhuangzhihan8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncrementTest extends JApplet implements ActionListener {
	private Increment incrementObject;
	private JButton button;
	
	// set up GUI
	public void init() {
		incrementObject = new Increment(5);
		
		Container container = getContentPane();
		
		button = new JButton("Click to increment");
		button.addActionListener(this);
		container.add(button);
	}
	
	// add INCREMENT to total when user clicks button
	public void actionPerformed(ActionEvent actionEvent) {
		incrementObject.increment();
		showStatus(incrementObject.toIncrementString());;
	}
	
}// end class Increment

// class containing constant variable 
class Increment{
	private int count = 0; 	// number of increments
	private int total = 0; 	// total of all increments
	private final int INCREMENT;// constant variable
	
	// initialize constant INCREMENT
	public Increment(int incrementValue) {
		INCREMENT = incrementValue; // initialize constant variable(once)
	}
	
	// add INCREMENT to total and add 1 to count
	public void increment() {
		total += INCREMENT;
		++count;
	}
	
	// return String representation of an Increment object's data
	public String toIncrementString() {
		return "After increment " + count + ": total = " + total;
	}

}// end class IncrementTest


