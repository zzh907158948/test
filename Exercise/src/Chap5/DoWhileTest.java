package Chap5;

import java.awt.Graphics;

import javax.swing.JApplet;

public class DoWhileTest extends JApplet {
	public void paint(Graphics g) {
		super.paint(g);
		int counter = 1;
		do {
			//drawOval（画圆的）的四个参数分别表示一个假想的矩形的左上角x坐标，左上角y坐标
			//宽度和高度
			g.drawOval(110 - counter *10, 110 - counter * 10, 
					counter * 20, counter * 20 );
			++counter;
		} while(counter <= 10);
	}

}
