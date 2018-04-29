// Fig. 5.14: ContinueLabelTest.java
// Labeled continue statement.

package pers.Zhuangzhihan5;
import javax.swing.JOptionPane;

public class ContinueLabelTest {
	public static void main(String[] args) {
		String output = "";
		
		nextRow: 	// target label of continue statement
			
			// count 5 rows
			for(int row = 1; row <= 5; row++){
				output += "\n";
				
				// count 10 columns per row
				for (int columns = 1; columns <= 10; columns++) {
					
					// if column greater than row, start next row
					if (columns > row)
						continue nextRow;	// next iteration of labeled loop
					
					output += "* ";
					
				}// end inner for
				 
			}//	end outer for
		
		JOptionPane.showMessageDialog(null, output, 
				"Testing continue with label",
				JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0); 	// terminate application
		
	}// end main
	
}// end class ContinueLabelTest
