package Chap6;

import java.awt.Container;
import javax.swing.*;

public class Scoping extends JApplet{
	JTextArea outputArea;//创建文本区域GUI组件
	
	int x = 1;//将x初始化为1，在所有声明了名为x的变量的块或方法中，这个值都会被屏蔽
	
	public void init() 
	{
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
	}
	
	public void start() 
	{
		int x = 5;//局部变量
		outputArea.append("Local x in start is " + x);
		
		useLocal();
		useField();
		useLocal();
		useField();
		
		outputArea.append("\n\nLocal x in start is " + x);
	}
	
	public void useLocal() 
	{
		int x = 25;
		outputArea.append("\n\nLocal x in useLocal is " + x + 
				" before exiting useLocal.");
		++x;
		outputArea.append("\n\nLocal x in useLocal is " + x + 
				" before exiting useLocal.");
	}
	public void useField() 
	{
		outputArea.append("\n\nField x is " + x + 
				" on entering useField.");
		x *= 10;
		outputArea.append("\n\nField x is " + x + 
				" on entering useField.");
	}

}
