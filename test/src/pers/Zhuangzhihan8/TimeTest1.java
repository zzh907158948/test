// Fig. 8.2: TimeTest1.java
// Class TimeTest1 to exercise class Time1.

package pers.Zhuangzhihan8;
import javax.swing.JOptionPane;

public class TimeTest1 {
	public static void main(String[] args) {
		Time1 time = new Time1();// calls Time1 constructor
		
		// append String version of time to String output
		String output = "The initial universal time is:" + 
				time.toUniversalString() + "\nThe initial standard time is: "+
				time.toStandardString();
		
		// change time and append updated time to output
		time.setTime(13, 27, 6);
		output += "\n\nUniversal time after setTime is: " + 
		time.toUniversalString() + 
		"\nStandarf time after setTime is:" + time.toStandardString();
		
		// set time with invalid values; append updated time to output 
		time.setTime(99, 99, 99);
		output += "\n\nAfter attempting invalid setting: " +
				"\nUniversal time: " + time.toUniversalString() +
				"\nStandard time: " + time.toStandardString();
		
		JOptionPane.showMessageDialog(null, output, 
				"Testing Class Time1", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	}// end main

}// end class TimeTest1
