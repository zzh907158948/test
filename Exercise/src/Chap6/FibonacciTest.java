package Chap6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FibonacciTest extends JApplet implements ActionListener
{
	JLabel numberLabel, resultLabel;
	JTextField numberField, resultField;
	
	public void init() 
	{
		//获得内容面板并把它的格式设置成FlowLayout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//创建numberLabel1
		numberLabel = new JLabel("Enter an integer and press Enter ");
		container.add(numberLabel);
		//创建numberField，长度为10
		numberField = new JTextField(10);
		container.add(numberField);
		
		//比如你定义了一个按钮，用addActionListener就可以给这个按钮添加一个监听者，
		//一旦有事件发生（比如鼠标点击），监听者都可以得到这个事件，并可以把事件信息（例如事件源）传给事件处理函数
		numberField.addActionListener(this);
		
		resultLabel = new JLabel("Fibonacci value is ");
		container.add(resultLabel);
		resultField = new JTextField(15);
		resultField.setEditable(false);////标明用户不能在JTextField中输入
		container.add(resultField);
	}
	
	//获得用户的输入
	public void actionPerformed(ActionEvent actionEvent) 
	{
		//获得用户输入并转换成long形式
		long number, fibonacciValue;
		number = Long.parseLong(numberField.getText());
		
		showStatus("Calculating...");//没懂这一句是在干嘛
		//计算fibonacci数
		fibonacciValue = fibonacci(number);
		
		showStatus("Done.");
		resultField.setText(Long.toString(fibonacciValue));
	}
	
	public long fibonacci(long n) 
	{
		if(n==0||n==1)
			return n;
		else 
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
