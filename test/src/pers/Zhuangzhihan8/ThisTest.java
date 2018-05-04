// Fig. 8.4: ThisTest.java
// Using the this reference to refer to fields and methods.

package pers.Zhuangzhihan8;
import javax.swing.*;
import java.text.DecimalFormat;

public class ThisTest {
	public static void main(String[] args) {
		SimpleTime time = new SimpleTime(12, 30, 19);
	
		JOptionPane.showMessageDialog(null, time.buildString(),
				"Demonstrating the \"this\" Reference",
				JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}// end class ThisTest

// class SipleTime demonstrates the "this" reference
class SimpleTime{
	private int hour;
	private int minute;
	private int second;
	
	// constructor uses parameter names identical to instance variable
	// names; "this" reference required to distinguish between names
	public SimpleTime(int hour, int minute, int second) {
		this.hour = hour;	// set "this" object's hour
		this.minute = minute; // set "this" object's minute
		this.second = second; // set "this" object's second
	}		
	
	// use explicit and implicit "this" to call toStandardString
	public String buildString() {
		return "this.toStandardString(): " + this.toStandardString() +
				"\ntoStandardString(): " + toStandardString();
	}

	// return String representation of SimpleTime
	public String toStandardString() {
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		// "this" is not required here, because method does not
		// have local variables with same names as instance variables
		return twoDigits.format(this.hour) + ":" +
			twoDigits.format(this.minute) + ":" +
			twoDigits.format(this.second);
			
	} 
	
}// end class SimpleTime

