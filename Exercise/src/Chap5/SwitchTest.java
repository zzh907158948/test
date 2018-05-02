package Chap5;

import java.awt.Graphics;
import javax.swing.*;

public class SwitchTest extends JApplet {
	int choice;
	
	public void init() {
		String input;
		//JOptionPane类可显示可包含文本、按钮等的消息框
		//JOptionPane.showInputDialog方法返回用户输入的字符串。
		input = JOptionPane.showInputDialog("Enter 1 to draw lines\n"
										+ "Enter 2 to draw rectangles\n" 
										+ "Enter 3 to draw ovals\n");
		//把input转化成整型数字
		choice = Integer.parseInt(input);
	}
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 1; i <= 10; i++) {
			switch(choice) {
			case 1:
				//drawLine(int x1, int y1, int x2, int y2)
				//直线起点的x1、y1坐标，终点的x2、y2坐标
				g.drawLine(10, 10, 250, 10 + i*10);
				break;
			case 2:
				//drawRcet(int x, int y, int width, int height),绘制矩形的x轴，y轴，宽度，高度
				g.drawRect(10 + i*10, 10 + i*10, 50 + i*10, 50 + i*10);
				break;
			case 3:
				//drawOval(int x, int y, int width, int height)
				//drawOval（画圆的）的四个参数分别表示一个假想的矩形的左上角x坐标，
				//左上角y坐标,宽度和高度
				g.drawOval(10+i*10, 10 + i*10, 50 + i*10, 50 + i*10);
				break;
			default:
				g.drawString("Invalid value entered", 10, 20+i*15);	
			}
		}
	}
}
