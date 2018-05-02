package Chap6;

import javax.swing.JOptionPane;

public class RandomIntegers {

	public static void main(String[] args) {
		int value;
		String output = "";
		
		for (int counter = 1; counter<=20; counter++) {
			//随机整数从1到6
			value = 1 + (int)(Math.random() * 6);
			output += value + " ";
			if(counter %5 == 0)
				output += "\n";
		}
		JOptionPane.showMessageDialog(null, output, 
				"20 Random Numbers from 1 to 6", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
