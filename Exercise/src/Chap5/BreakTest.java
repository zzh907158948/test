package Chap5;

import javax.swing.JOptionPane;

public class BreakTest {
	public static void main (String[] args) {
		
		//定义一个空字符串output
		String output = "";
		int count;
		
		for (count = 1; count <= 10; count++) {
			if(count == 5)
				break;
			//字符串output = output + count再加空格
			output += count + " ";
		}
		output += "\nBroke out of loop at count = " + count;
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}

}
