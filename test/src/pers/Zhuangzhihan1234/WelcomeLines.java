// Fig. 3.11: WelcomeLines.java
// Displaying text and lines.

//Java packages
package pers.Zhuangzhihan1234;
import java.awt.Graphics;	// import class Graphics
import javax.swing.*;	// import package javax.swing

public class WelcomeLines extends JApplet{
	// draw lines and a string on applet's background
		public void paint(Graphics g) {
			// call superclass version of method paint
			super.paint(g);
			
			// draw horizontal line from (15,10) to (210,10)
			g.drawLine(15, 10, 210, 10);
			
			// draw horizontal line from (15,30) to (210,30)
			g.drawLine(15, 30, 210, 30);
			
			// draw String between lines at location (25, 25)
			g.drawString("Welcome to Java Programming!",  25,  25);	//ÏÔÊ¾"Welcome to Java Programming!"µÄ×ø±ê£¨25£¬25£©
					
		}	// end method paint
	
}	//end class WelcomeLines
