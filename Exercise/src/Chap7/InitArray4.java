//用初始化值来初始化二维数组，并用嵌套的for结构遍历各数组
package Chap7;

import java.awt.Container;
import javax.swing.*;

public class InitArray4 extends JApplet 
{
	JTextArea outputArea = new JTextArea();
	public void init() 
	{
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		int array1[][] = {{1,2,3},{4,5,6}};//第一行初始化为1，2，3；第二行初始化为4，5，6
		//用了长度不同的初始化值
		//第一行1，2；第二行3；第三行4，5，6
		int array2[][] = {{1,2},{3},{4,5,6}};
		
		outputArea.setText("Values in array1 by row are\n");
		buildOutput(array1);//调用buildOutput，将每个数组的元素添加到文本区域
		
		outputArea.append("Values in array2 by row are\n");
		buildOutput(array2);
		
	}
	
	//接受一个二维数组作为参数
	public void buildOutput(int array[][])
	{
		//array.length确定数组行数
		for(int row = 0; row < array.length; row++)
		{
			//array[row].length确定数组当前行的列数
			for(int column = 0; column < array[row].length; column++)
				outputArea.append(array[row][column] + " ");
			
			outputArea.append("\n");
		}
	}
	
}
