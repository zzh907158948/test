// Fig. 7.9: PassArray.java
// Passing arrays and individual array elements to methods.
import java.awt.Container;
import javax.swing.*;

public class PassArray extends JApplet {
	
	// initialize applet
	public void init() 
	{
	   JTextArea outputArea = new JTextArea();
	   Container container = getContentPane();
	   
	   int array[] = { 1, 2, 3, 4, 5 };
	   
	   String output = "Effects of passing entire array by reference:\n" 
	      + "The values of the original array are:\n";
	   
	   // append original array elements to String output
	   for ( int counter = 0; counter < array.length; counter++ )
		   output += " " + array[ counter ];
	   
	   modifyArray( array ); // array passed by reference
	   
	   output += "\n\nThe values of the modified array are:\n";
	   
	   // append modified array elements to String output
	   for ( int counter = 0; counter < array.length; counter++ )
		   output += " " + array[ counter ];
	   
	   output += "\n\nEffects of passing array element by value:\n" +
	      "array[3] before modifyElement: " + array[ 3 ];
	   
	   modifyElement( array[ 3 ] ); // attempt to modify array[3]
	   
	   output += "\narray[3] after modifyElement: " + array[ 3 ];
	   outputArea.setText( output );
			   
	} // end method init
	
	// multiply each element of an array by 2
	public void modifyArray( int array2[] ) 
	{
	   for ( int counter = 0; counter < array2.length; counter++ )
		   array2[ counter ] *= 2;
	}
	
	// multiply argument by 2
	public void modifyElement( int element )
	{
	   element *= 2;
	}
} // end class PassArray