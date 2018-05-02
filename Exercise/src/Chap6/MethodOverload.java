package Chap6;

import java.awt.Container;
import javax.swing.*;

public class MethodOverload extends JApplet{
	public void init () 
	{
		JTextArea outputArea =  new JTextArea();//创建一个outpuArea
		Container container = getContentPane();
		container.add(outputArea);
		//输出
		//setText是会把之前的覆盖的
		outputArea.setText("The square of integer 7 is " + square(7)
		+ "\nThe square of double 7.5 is " + square(7.5));
	}
	
	public int square(int intValue) 
	{
		System.out.println("Called square with int argument: " + 
							intValue);
		return intValue*intValue;
	}
	
	public double square(double doubleValue) 
	{
		System.out.println("Called square with double argument: " + 
							doubleValue);
		return doubleValue*doubleValue;
	}
	
}
