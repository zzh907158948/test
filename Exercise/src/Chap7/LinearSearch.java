//包含一个从0~198的100个偶数元素的数组，输入后，按下enter键查找
//还没解决！
package Chap7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//要用enter键的时候要implements ActionListener
public class LinearSearch extends JApplet implements ActionListener 
{
	JLabel enterLabel, resultLabel;
	JTextField enterField, resultField;
	int array[];
	
	public void init() 
	{
		//创建内容面板并设置格式
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//输入
		enterLabel = new JLabel("Enter integers search key");
		container.add(enterLabel);
		
		enterField = new JTextField(10);
		container.add(enterField);
		
		//和按enter操作关联在一起
		enterField.addActionListener(this);
		
		//输出
		resultLabel = new JLabel("Result");
		container.add(resultLabel);
		
		resultField = new JTextField(20);
		resultField.setEditable(false);//不能被修改
		container.add(resultField);
		
		array = new int[100];
		
		for(int counter=0; counter<array.length; counter++)
			array[counter] = 2*counter;
	}

	public int linearSearch(int array2[], int key) 
	{
		for(int counter = 0; counter <array2.length; counter++)
			if(array2[counter] == key)
				return counter;
		return -1;
	}
	
	//获得用户输入然后调用LinearSearch方法
	public void actionPerformed(ActionEvent actionEvent) 
	{
		//输入也可以由enterField.getText()获得
		String searchKey = actionEvent.getActionCommand();
		
		int element = linearSearch(array, Integer.parseInt(searchKey));
		
		if(element != -1)
			resultField.setText("Found value is element " + element);
		else 
			resultField.setText("Value not found");
		
	}
}
