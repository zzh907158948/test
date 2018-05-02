package Chap5;

import javax.swing.JOptionPane;

public class BreakLabelTest {

	public static void main(String[] args) {
		String output = "";
		//标记这个循环
		stop: {
			for (int row = 1; row <= 10; row++) {
				for (int column = 1; column <=5; column++) {
					if (row == 5) 
						break stop;//当row等于5时，跳出stop循环
					output += "*";
				}
				output += "\n";
			}
			output += "\nLoops terminated normally";//这一句被跳过了
		}
		//跳出循环后从这里开始
		JOptionPane.showMessageDialog(null, output, "Testing break with a label",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
