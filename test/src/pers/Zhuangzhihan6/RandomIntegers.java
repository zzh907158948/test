// Fig. 6.7: RandomIntegers.java
// Shifted, scaled random integers.

package pers.Zhuangzhihan6;
import javax.swing.*;

public class RandomIntegers {
	public static void main(String[] args) {
		int value;
		String output = "";
		
		// loop 20 times
		for (int counter = 1; counter <= 20; counter++) {
			
			// pick random integer between 1 and 6
			value = 1 + (int) (Math.random() * 6);
			
			output += value + " ";// append value to output
			
			// if counter divisible by 5, append newline to string output
			if (counter % 5 == 0) {
				output += "\n";				
			}	
			
		}// end for
		
		JOptionPane.showMessageDialog(null, output, 
					"20 random numbers from 1 to 6",
					JOptionPane.INFORMATION_MESSAGE);
		
	}// end main
	
}// end class RandomIntegers
