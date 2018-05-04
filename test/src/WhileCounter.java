// Fig. 5.1: WhileCounter.java
//图5.1 WhileCouter.java文件
// Counter-controlled repetition.
// 计数器控制的循环
import java.awt.Graphics;

import javax.swing.JApplet;

public class WhileCounter extends JApplet { 
	
	//draw lines on applet's background
	//在applet页面绘出线条
	public void paint( Graphics g)
	{
		super.paint(g);  // call paint method inherited from JApplet
		// 调用继承自JApplet的paint方法
		int counter = 1;  // initialization 初始化
		
		while ( counter <= 10 ) { // repetition condition 循环条件
			g.drawLine(10, 10, 250, counter *10 );
			++counter; // increment 加法
			
		} // end while 结束while循环
		
	} // end method paint 结束方法paint
	
} // end class WhileCounter 结束类WhileCounter