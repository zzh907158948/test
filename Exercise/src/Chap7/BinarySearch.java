//迭代的二叉查找
//该方法接受2个参数，array2的整数数组，key整数
package Chap7;

import java.awt.*;
import java.awt.event.*;
import java.text.*;

import javax.swing.*;

public class BinarySearch extends JApplet implements ActionListener 
{
	JLabel enterLabel, resultLabel;
	JTextField enterField, resultField;
	JTextArea output;
	
	int array[];
	String display = "";
	
	//初始化
	public void init() 
	{
		//创建container，并设置格式为FlowLayout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//创建JLabel储存输入
		enterLabel = new JLabel("Enter integer search key");
		container.add(enterLabel);
		
		//创建JTextField储存输入
		enterField = new JTextField(10);
		container.add(enterField);
		enterField.addActionListener(this);//和enter键关联
		
		//创建JLabel储存输出
		resultLabel = new JLabel("Result");
		container.add(resultLabel);
		
		//创建JTextField储存输出
		resultField = new JTextField(20);
		resultField.setEditable(false);//不可被用户更改
		container.add(resultField);
		
		output = new JTextArea(6,60);//创建JTextArea并设置长宽
		//Font类用于创建字体显示效果（字体名称，样式，大小）
		//粗体（Font.BOLD)，正常(Font.PLAIN)，黑体(Font.ITALIC)，斜粗体(Font.BOLD+Font.ITALIC)
		output.setFont(new Font("Monospaced", Font.PLAIN, 12));
		container.add(output);
		
		//创建整数数组array，并加入0~28的偶数
		array = new int[15];
		for(int counter = 0; counter<array.length; counter++)
			array[counter] = 2 * counter;
		
	}

	//获得用户输入，并调用binarySearch方法
	public void actionPerformed(ActionEvent actionEvent) 
	{
		//输入也可以由enterField.getText()获得
		String searchKey = actionEvent.getActionCommand();
		display = "Portions of array searched\n ";
		
		//调用binarySearch方法
		int element = binarySearch(array, Integer.parseInt(searchKey));
		
		//输出
		output.setText(display);
		
		if(element != -1)
			resultField.setText("Found value in element " + element);
		else
			resultField.setText("Value not found");
		
	}
	
	//二叉查找
	public int binarySearch(int array2[], int key) 
	{
		int low = 0;
		int high = array2.length - 1;
		int middle;
		
		//循环直到低指数比高指数大
		while(low <= high)
		{
			middle = (low+high) /2;//定义中指数
			//显示二进制搜索循环迭代中使用的数组元素的子集
			buildOutput(array2, low, middle,high);
			//如果key匹配middle，就返回middle
			if(key == array[middle])
				return middle;
			//如果key小，就把high-1
			else if(key < array[middle])
				high = middle -1;
			//如果key大，就把low+1
			else 
				low = middle -1;		
		}
		//循环结束返回-1，没有匹配
		return -1;
	}
		
	//构建显示当前正在处理的数组元素的子集的输出行
	public void buildOutput(int array3[], int low, int middle, int high)
	{
		//DecimalFormat 是 NumberFormat 的一个具体子类，用于格式化十进制数字
		DecimalFormat twoDIgits = new DecimalFormat("00");
		
		for(int counter = 0; counter < array3.length; counter++)
		{
			if(counter<low||counter>high)
				display += " ";
			else if(counter == middle)
				display += twoDIgits.format(array3[counter]) + "* ";
			else
				display += twoDIgits.format(array3[counter]) + " ";
		}
		display += "\n";
	}
	
}
