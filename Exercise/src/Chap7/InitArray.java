//用关键词new创建一个包含10个int型元素的数组，这些元素的初始值为0.
//程序以表格的形式将这10个元素显示在JTextArea的对象中
package Chap7;

import javax.swing.*;

public class InitArray {

	public static void main(String[] args) 
	{
		int array[];//声明一个能引用int型元素的数组array[]
		array = new int[10];//创建数组
		//也可以用int array[]=new int[10];
		String output = "Index\tValue\n";//在名为output的String对象里构造输出结果
		
		for(int counter=0; counter<array.length; counter++)//注意counter要从0开始
			output += counter + "\t" + array[counter] + "\n";
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);

		JOptionPane.showMessageDialog(null, outputArea, 
				"Initializing an Array of int Values", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
