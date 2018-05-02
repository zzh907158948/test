package Chap6;
//文本区域outputArea
import java.awt.Container;
import javax.swing.*;
//找出浮点数最大的值
public class MaximumTest extends JApplet{
//初始化applet通过获得输入，并创建GUI
	public void init() {
		//输入s1,s2,s3
		String s1 = JOptionPane.showInputDialog("Enter first floating-point value");
		String s2 = JOptionPane.showInputDialog("Enter second floating-point value");
		String s3 = JOptionPane.showInputDialog("Enter third floating-point value");
		//将字符串转化成double型
		double number1 = Double.parseDouble(s1);
		double number2 = Double.parseDouble(s2);
		double number3 = Double.parseDouble(s3);
		//通过maximum方法得出三个中的最大值
		double max = maximum(number1, number2, number3);
		//创建JTextArea
		JTextArea outputArea = new JTextArea();
		//display
		outputArea.setText("number1: " + number1 + 
					"\nnumber2: " + number2 + 
					"\nnumber3: " + number3 + "\nmaximum: " + max);
		Container container = getContentPane();
		container.add(outputArea);
	}
	//maximum方法，判断最大值
	public double maximum (double x, double y, double z) {
		return Math.max(x, Math.max(y, z));
	}
}
