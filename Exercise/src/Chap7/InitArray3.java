//创建一个包含10个元素的数组，并将2到20的各个偶数值赋给各元素
package Chap7;

import javax.swing.*;

public class InitArray3 {
	public static void main(String[] args) {
		final int ARRAY_LENGTH = 10;//元素数（不可被改变）
		int array[];//声明整型数组
		array = new int[ARRAY_LENGTH];//长度为ARRAY_LENGTH
		
		String output = "Index\tValue\n";
		//计算每个数组元素的值
		for(int counter = 0; counter < array.length; counter++)
		{
			array[counter] = 2 + 2*counter;
			output += counter + "\t" + array[counter] + "\n";
			}
		//创建JTextArea并输出output
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea,
				"Initializing to Even Numbers from 2 to 20",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
