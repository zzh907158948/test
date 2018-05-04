//Fig.7.8:StudentPoll.java
//Student poll program
import javax.swing.*;

public class StudentPoll {
	public static void main(String args[]) {
		int responses[]={1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7,6,5,7,6,
				8,6,7,5,6,6,5,6,7,5,6,4,8,6,8,10};
		int frequency[]=new int[11];
		
		//for each answer,select response element and use that value
		//as frequency index to determine element to increment
		for (int answer = 0; answer < responses.length; answer++) 
			++frequency[responses[answer]];
		
		String output="Rating\tFrequency\n";
		
		//append frequencies to String output
		for (int rating = 1; rating < frequency.length; rating++) 
			output+=rating+"\t"+frequency[rating]+"\n";
		
		
		 JTextArea outputArea=new JTextArea();
		 outputArea.setText(output);
		 
		 JOptionPane.showMessageDialog(null,outputArea,
				   "Student poll program",
				   JOptionPane.INFORMATION_MESSAGE);
		 System.exit(0);
		
			
		
		}//end main

}//end class
