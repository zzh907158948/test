// Fig. 5.9: SwithTest.java
// Drawing lines, rectangles or ovals based on user input.

package pers.Zhuangzhihan5;
import java.awt.Graphics;
import javax.swing.*;

public class SwithTest extends JApplet{
	int choice;	// user's choice of which shape to draw
	
	// initialize applet by obtain user's choice
	@Override
	public void init() {
		String input; 	// user's input
		
		// obtain user's choice
		input = JOptionPane.showInputDialog("Enter 1 to draw lines\n" +
				"Enter 2 to draw rectangles\n" +
				"Enter 3 to draw ovals\n");
		
		choice = Integer.parseInt(input);	// convert input to int
	
	}// end method init
	
	// draw shapes on applet's background
	@Override
	public void paint(Graphics g) {
		super.paint(g);	// call paint method inherited from JApplet
		
		for (int i = 0; i < 10; i++) {	// loop 10 times (0-9)
			
			switch (choice) {	// determine shape to draw 
			case 1:	// draw a line
				g.drawLine(10, 10, 250, 10 +i * 10);		
				break;	// done proccesing case
				
			case 2: // draw a rectangle
				g.drawRect(10 + i * 10, 10 + i * 10,
						50 + i * 10,  50 + i * 10);
				break;// done proccesing case
				
			case 3:	// draw a oval
				g.drawOval(10 + i * 10, 10 + i * 10,
						50 + i * 10,  50 + i * 10);
				break;	// done proccesing case
				
			default:// draw string indicating invalid value entered
				g.drawString("Invalid value entered", 10 , 20 + i * 15);

			}// end switch
			
		}	// end for
		
	}// end method paint
	
}// end class SwitchTest
