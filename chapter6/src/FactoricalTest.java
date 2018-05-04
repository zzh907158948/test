//Fig 6.15:FactorialTest.java
//Recursive factorial method
import java.awt.*;

import javax.swing.*;

public class FactoricalTest  extends JApplet{
	JTextArea outputArea;
	
	//create GUI and calculate factorials of 0-10
	public void init()
	{
		outputArea= new JTextArea();
		
		Container container=getContentPane();
		container.add(outputArea);
		
		//calculate the factorials of 0 through 10
		for (long counter=0;counter<=10;counter++)
			outputArea.append(counter+"! = "+factorial(counter)+"\n");
			}   //end method init
	
	//recursive declaration of method factorial
	public long factorial(long number){
		//base case 
		if(number<=1)
			return 1;
		//recursive step
		else 
			return number*factorial(number-1);
	}   //end method factorial

}  //end class FactorialTest
