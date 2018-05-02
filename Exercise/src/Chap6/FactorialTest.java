package Chap6;

import java.awt.*;
import javax.swing.*;

public class FactorialTest extends JApplet 
{
	JTextArea outputArea;
	
	public void init() 
	{
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		for(long counter = 0; counter<=10; counter++)
			outputArea.append(counter + "!=" +factorial(counter) + "\n");
	}
	
	public long factorial( long number) 
	{
		if(number <= 1)
			return 1;
		else {
			return number*factorial(number - 1);
		}
	}
}
