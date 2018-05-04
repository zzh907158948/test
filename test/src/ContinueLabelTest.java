// Fig. 5.14: ContinueLabelTest.java
// Labeled continue statement.
import javax.swing.JOptionPane;

public class ContinueLabelTest {
	
	public static void main( String args[] )
	{
		String output = "";
		
		nextRow: // target label of continue statement
			
			// count 5 rows
			for (int row = 1; row <= 5; row++) {
				output += "\n";
			
			    // count 10 columns per row
				for (int column = 1; column <= 10; column++) {
					
					// if column greater than row, start next row
					if ( column > row )  
					   continue nextRow;   // next iteration of labeled loop
						
					output += "* ";
					
				} // end inner for
				
			} // end outer for
			
			// following line is skipped
			output += "\nLoops terminated normally";
		
		JOptionPane.showMessageDialog( null, output,
			"Testing continue with a label",
			JOptionPane.INFORMATION_MESSAGE );
		
		System.exit( 0 ); // terminate application
		
	} // end main
	
} // end class ContinueLabelTest