package Chap5;

import javax.swing.JOptionPane;

public class ContinueLabelTest {

	public static void main(String[] args) {
		String output = "";
		//标记第一个for循环为nextRow
		nextRow:
			for(int row = 1; row <= 5; row++) {
				output += "\n";
				for(int column = 1; column <= 10; column++) {
					if(column > row)
						continue nextRow;//直接结束这一次循环，再次运行第一个循环
					output += "*  ";
				}
			}
		JOptionPane.showMessageDialog(null, output, 
		"Testing continue with a label",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);//终止
	}
}
