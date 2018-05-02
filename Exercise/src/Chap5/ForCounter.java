package Chap5;

import java.awt.Graphics;
import javax.swing.JApplet;

public class ForCounter extends JApplet {
	public void paint(Graphics g) {
		super.paint(g);
		for(int counter =1; counter <= 10; counter++) 
			g.drawLine(10, 10, 250, counter * 10);
	}

}
