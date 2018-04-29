// Fig. 5.2: ForCounter.java
// Counter-controlled repetition with the for statement.

package pers.Zhuangzhihan5;
import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JApplet;

public class ForCounter extends JApplet{
	// draw lines on applet's background
	@Override
	public void paint(Graphics g) {
		super.paint(g);		// call paint method inherited from JApplet
		
		// for statement header includes initialization,
		// repetition condition and increment
		for (int counter = 1; counter <= 10; counter++){	//counter for循环外可再次声明？
			g.drawLine(10, 10, 250, counter * 10);
		}
		
	}	// end method paint
	
}	// end class ForCounter
