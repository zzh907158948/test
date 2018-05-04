//Fig.6.12: MethodOverload.java
//Using overloaded methods
import java.awt.Container;

import javax.swing.*;

public class MethodOverload extends JApplet {
	
	//create GUI and call each square method
	public void init()
	{
		JTextArea outputArea=new JTextArea();
		Container container=getContentPane();
		container.add(outputArea);
		
		outputArea.setText("The square of integer 7 is "+ square(7)+
				"\nThe square of double 7.5 is "+square(7.5));
		
	}  //end method init
	
	//square method with int argument
	public int square (int intValue)
	{
		System.out.println("Called square with int argument: "+intValue);
		return intValue*intValue;
		
	}  //end method square with int argument
	
	//square method with double argument
	public double square(double doubleValue)
	{
		System.out.println("Called square with double argument: "+doubleValue);
		return doubleValue*doubleValue;
		
	}  //end method square with double argument
	

}  //end class MethodOverload
