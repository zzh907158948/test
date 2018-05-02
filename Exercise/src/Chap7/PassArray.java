//这个applet说明了传递整个数组和传递一个基本类型数组元素之间的区别
package Chap7;

import java.awt.Container;
import javax.swing.*;

public class PassArray extends JApplet 
{
	public void init() 
	{
		//创建JTextArea并初始化container
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		int array[] = {1,2,3,4,5};
		
		String output = "Effects of passing entire arry by reference:\n"
				+ "The values of the original array are:\n";
		
		for(int counter = 0; counter <array.length; counter++)
			output += "  " +array[counter];
		
		//对比调用一个数组和数组里的一个值
		
		//将array作为参数传递，并且方法modifyArray确实会修改每个元素的值
		modifyArray(array);
		
		output += "\n\nThe values of the modified array are:\n";
		
		for(int counter = 0; counter < array.length; counter++)
			output += "  " + array[counter];
		
		//为显示array[3]在调用方法modifyElement前的值
		output += "\n\nEffects of passing array element by value:\n"
		+ "array[3] before modifyElement: " + array[3];
		
		modifyElement(array[3]);
		
		output += "\narray[3] after modifyElements: " + array[3];
		outputArea.setText(output);
	}
public void modifyArray(int array2[]) 
{
	for(int counter = 0; counter < array2.length; counter++)
		array2[counter] *= 2;
}

public void modifyElement(int element) 
{
	element *= 2;
}
		
}
