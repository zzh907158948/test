package Chap3;
//包
import java.awt.Graphics;//导入Graphics类，Graphics类可以让java applet
						//绘制直线、矩形、椭圆形以及字符串等
import javax.swing.JApplet;//导入JApplet类，
						//在java中创建applet必须导入JApplet类

//类名：WelcomeApplet，继承JApplet的数据和方法
//JApplet是WelcomeApplet的superclass，WelcomeApplet是JApplet的subclass
public class WelcomeApplet extends JApplet {
//applet的paint方法（3个applet方法之一，init、start、paint）
	public void paint(Graphics g) {
		super.paint(g);//applet容器调用JApplet的paint方式
					//这句话因该是每个applet的paint方法的第一个语句
		//用了Graphics类的drawString方法
		//第一个参数设计要绘制的字符串，最后两个参数是字符串左下角所在平面坐标
		g.drawString("Welcome to JAVA Programing!", 25, 25);
	}
}
