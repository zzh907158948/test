//Fig.6.10:Scoping.java
//A scoping example

import java.awt.Container;

import javax.swing.*;
public class Scoping  extends JApplet{
	JTextArea outputArea;
	
	//Field that is accessible to all methods of this class
	int x=1;
	
	//create applet's GUI
	public void init()
	{
		outputArea=new JTextArea();
		Container container=getContentPane();
		container.add(outputArea);
		
	} //end method init
	 
	//method start called after init completes;start calls
	//methods useLocal and use Field
	public void start ()
	{
		int x=5;  //local variable in method start that shadows field x
		
		outputArea.append("local x in start is "+x);
		useLocal();  //useLocal has local x
		useField();  //useInstance uses Scoping's field
		useLocal();  //useLocal reinitializes local x
		useField();  //Scoping's field x retains its value
		
		outputArea.append("\n\nlocal x in start is "+x);
		
	}  //end method start
	
	// useLocal creates and initializes local variable x during each call
	public void useLocal()
	{
		int x =25; //initialized local variable x during each call
		outputArea.append("\n\nlocal x in start is "+x
				+"after entering useLocal");
		++x;
		outputArea.append("\n\nlocal x in start is "+x
				+"before exiting useLocal");
	} // end method useLocal  
	//useField modifies Scoping's field x during each call
	public void useField()
	{
		outputArea.append("\n\nfield x is "+x+
				" on entering useField");
		x*=10;
		outputArea.append("\nfield x is"+x+
				"on exiting useField");
		
	}  //end method useInstance
      
}  //end class Scoping
