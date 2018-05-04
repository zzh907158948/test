//Fig.6.3:SquareIntegers.java
//Creating and using a programmer-defined method

import javax.swing.*;

import java.awt.Container;

public class SquareIntegers extends JApplet {
	//set up GUI and calculate squares of integers from 1 to 10
	public void init()
	{
		//JTextArea to display results
		JTextArea outputArea=new JTextArea();
		
		//get applet's content pane (GUI component display area)
		Container container=getContentPane();
		
		//attach outputArea to container
		container.add(outputArea);
		
		int result;   //store result of call to method square
		String output="";  //String containing results
		
		//loop 10 times
		for(int counter=1;counter<=10;counter++){
			result=square(counter);  //method call
			
			//append result to String output
			output+="The square of "+counter+" is "+result+"\n";
		} //end for
		
		outputArea.setText(output);  //place results in JTextArea
		
	}  //end method init
   //square method declaration
	public int square(int y)
	{
		return y * y;   //return square of y
		
	}  //end method square
}    //end class SquareInteger
