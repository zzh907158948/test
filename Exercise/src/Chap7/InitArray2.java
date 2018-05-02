//用10个数组初始化值创建数组，并对它的各个元素进行初始化
package Chap7;

import javax.swing.*;

public class InitArray2 {

	public static void main(String[] args) {
		//带着数字创建数组
		int array[] = {32,27,64,18,95,14,90,70,60,37}; 
		String output = "Index\tValue\n";
		
		for(int counter = 0; counter<array.length; counter++)
			output += counter + "\t" +array [counter] + "\n";
		
		//创建JTextArea并将output输出
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, "Initializing an Array of int Values", 
				output, JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		}

}
