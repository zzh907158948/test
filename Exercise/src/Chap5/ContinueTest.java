package Chap5;

import javax.swing.JOptionPane;

public class ContinueTest {
	public static void main(String[] args) {
		String output = "";
		
		for(int count = 1; count <= 10; count++) {
			if(count == 5)
				continue;//重新开始循环
			output += count + " ";
		}
		output += "\nUsed continue to skip printing 5";
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}
