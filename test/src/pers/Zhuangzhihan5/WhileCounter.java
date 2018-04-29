// Fig. 5.1: WhileCounter.java
// Counter-controlled repetition

package pers.Zhuangzhihan5;
import java.awt.Graphics;
import javax.swing.JApplet;

public class WhileCounter extends JApplet{
	// draw lines on applet's background
	@Override
	public void paint(Graphics g) {
		super.paint(g);		// call paint method inherited from JApplet
		
		int counter = 1;	// initialization
		
		while (counter <= 10) { // repetition condition
			g.drawLine(10, 10, 250, counter * 10);
			++counter;	// increment
		}	// end while
		
	}	// end method paint
	
}	// end class WhileCounter
