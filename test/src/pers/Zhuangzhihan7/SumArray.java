// Fig. 7.5: SumArray.java 
// Total the values of the elements of an array

package pers.Zhuangzhihan7;
import javax.swing.*;

public class SumArray {
	public static void main(String [] args){
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int total = 0;
	
		// add each element's value to total
		for( int counter = 0; counter < array.length; counter++)
			total += array[counter];
	
		JOptionPane.showMessageDialog(null,
				"Total of array elements: " + total,
				"Sum of array elements of an Array",
				JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	}// end main
	
}// end class SumArray
