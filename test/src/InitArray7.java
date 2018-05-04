// Fig. 7.14: InitArray7.java
// Initializing two-dimensional arrays.
import java.awt.Container;
import javax.swing.*;

public class InitArray7 extends JApplet {
	JTextArea outputArea;
	
	// set up GUI and initialize applet
	public void init() 
	{
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		int array1[][] = {{ 1, 2, 3 }, { 4, 5, 6 }};
		int array2[][] = {{ 1, 2 }, { 3 }, { 4, 5, 6 }};
		
		outputArea.setText("Values in array1 by row are\n");
		buildOutput(array1);
		
		outputArea.append("\nValues in array2 by row are\n");
		buildOutput(array2);
	} // end method init
	
	// append rows and columns of an array to outputArea
	public void buildOutput(int array[][])
	{
		// loop through array's rows
		for (int row = 0; row < array.length; row++) {
			
			// loop through columns of current row 
			for (int column = 0; column < array[row].length; column++)
				outputArea.append(array[row][column] + "  ");
			
			outputArea.append("\n");
			
		}
	} // end method buildOutput
	
} // end class InitArray7