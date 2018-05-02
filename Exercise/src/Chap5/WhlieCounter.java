package Chap5;

import java.awt.Graphics;//导入绘制2D图像的包

import javax.swing.JApplet;
import javax.swing.JApplet;

public class WhlieCounter extends JApplet {
	public void paint(Graphics g)
	{
		super.paint(g);
		int counter = 1;
		/*while(counter <= 10)
		{
			g.drawLine(10, 10, 250, counter * 10);
			++counter;
		}*/
		while( ++counter <= 10)
			g.drawLine(10, 10, 250, counter * 10);
	}//结束paint方法
}
