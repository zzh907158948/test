// Fig. 3.9: WelcomeApplet2.java
// Displaying multiple strings in an applet.


//Java packages
package pers.Zhuangzhihan1234;
import java.awt.Graphics;	// import class Graphics
import javax.swing.JApplet;	// import class JApplet

public class WelcomeApplet2 extends JApplet{
	
	// draw text on applet background
	public void paint(Graphics g) {
		// call superclass version of method paint
		super.paint(g);
		
		// draw a String at x-coordinate 25 and y-coordinate 25
		g.drawString("Welcome to",  25,  25);	//显示"Welcome to"的坐标（25，25）
		g.drawString("Java Programming!", 25, 40);	//显示"Java Programming!"的坐标（25，40）
		
	}	// end method paint
}	//end class WelcomeApplet2
