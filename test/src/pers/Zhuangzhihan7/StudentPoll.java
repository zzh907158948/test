// Fig. 7.8: StudentPoll.java
// Student Poll program

package pers.Zhuangzhihan7;
import javax.swing.*;

public class StudentPoll {

	public static void main(String[] args) {
		int responses[] = {1,2,5,9,4,6,7,3,9,4,1,8,
				2,4,9,6,7,5,5,4,8,5,5,8,5,2,4,7,6,4,
				4,6,8,2,1,3,10,4,6,10,1,7};
		int frequency [] = new int[11];
		
		// for each answer, select responses element and use that value
		// as frequency index to determine element to increment
		for (int answer = 0; answer < responses.length; answer++) {
			++frequency[responses[answer]];
		}
		
		String output = "Rating\tFrequency\n";
		
		// append frequencies to String output
		for (int rating = 1; rating < frequency.length; rating++) {
			output += rating + "\t" + frequency[rating] + "\n";
		}
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea,
				"Student Poll Program", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	}// end main
	
}// end class StudentPoll
