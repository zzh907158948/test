//应用程序类，调用Time1的方法
//使用面向对象编程方法常常通过减少必须传递的参数来简化方法调用
package Chap8;

import javax.swing.JOptionPane;

public class TimeTest1 {

	public static void main(String[] args) {
		//声明类之后，就可以把它作为一个类型使用
		//每次使用new运算符创建类的一个对象时，都将调用该类的构造函数以初始化新对象的实例变量
		Time1 time = new Time1();//调用Time1的constructor
		String output = "The initial universal time is: " + 
		time.toUniversalString() + "\nThe initial standard time is: "
		+ time.toStandardString();
		
		time.setTime(13, 27, 6);
		
		output += "\n\nUniversal time after setTime is: " + 
		time.toUniversalString() + "\nStandard time after setTime is: "
		+ time.toStandardString();
		
		time.setTime(99, 99, 99);
		output += "\n\nAfter attemping invalid settings: " + 
		"\nUniversal time: " + time.toUniversalString() +
		"\nStandard time: " + time.toStandardString();
		
		JOptionPane.showMessageDialog(null, output, 
				"Testing Cladd Time1", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}

}
