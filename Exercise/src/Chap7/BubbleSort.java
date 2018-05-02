//将数组的各个值按升序排列（冒泡排序）
package Chap7;

import java.awt.*;
import javax.swing.*;

public class BubbleSort extends JApplet 
{
	public void init()
	{
		//创建JTextArea并初始化container
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		int array[] = {2,6,4,8,10,12,89,68,45,37};
		
		String output = "Data items in original order\n";
		
		for(int counter = 0; counter <array.length; counter++)
			output += " " + array[counter];
		
		//冒泡排序
		bubbleSort(array);
		
		output += "\n\nData items in ascending order\n";//升序
		
		for(int counter = 0; counter<array.length; counter++)
			output += " " + array[counter];
		
		outputArea.setText(output);
	}
	
	//先比较array2[0]和array2[1]，再比较array2[1]和array2[2]。。。。。
	//尽管有10个元素，但循环只需要执行9次
	public void bubbleSort(int array2[]) 
	{
		for(int pass = 1; pass < array2.length; pass++) {
			for(int element = 0; element < array2.length - 1; element++)
				if(array2[element] > array2[element + 1])
					swap(array2, element, element+1);
		}
	}
	
	//如果某次比较发现相邻2个元素是按降序排列的，就会调用swap方法来交换这两个元素
	public void swap(int array3[], int first, int second) 
	{
		int hold;
		hold = array3[first];
		array3[first] = array3[second];
		array3[second] = hold;
	}

}
