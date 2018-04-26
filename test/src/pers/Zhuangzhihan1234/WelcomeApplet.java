// Fig. 3.6: WelcomeApplet.java
// A first applet in Java.

//Java packages
package pers.Zhuangzhihan1234;
import java.awt.Graphics;	// import class Graphics
import javax.swing.JApplet;	// import class JApplet

public class WelcomeApplet extends JApplet{
	
	// draw text on applet background
	public void paint(Graphics g) {
		// call superclass version of method paint
		super.paint(g);
		
		// draw a String at x-coordinate 25 and y-coordinate 25
		g.drawString("Welcome to Java Programming!",  25,  25);//ÏÔÊ¾"Welcome to Java Programming!"µÄ×ø±ê£¨25£¬25£©
		
	}	// end method paint
}	//end class WelcomeApplet
