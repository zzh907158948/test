// Fig. 5.12: Continuetest.java
// Continuing with the next iteration of a loop.

package pers.Zhuangzhihan5;
import javax.swing.JOptionPane;

public class ContinueTest {
	public static void main(String[] args) {
		String output = "";
		int count;
		
		for (count = 1;count <= 10; count++){	// loop 10 times
			
			if (count == 5) 	// if count is 5
				continue;	 // skip remaining code in loop
			
			output += count + " ";
			
		} // end for
		
		output += "\nUsed continue to skip printing 5";
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0); // termination application

	}	// end main
	
}	// end class ContinueTest
