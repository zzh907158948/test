//应用程序类，调用Time1的方法
package Chap8;

import javax.swing.JOptionPane;

public class TimeTest1 {

	public static void main(String[] args) {
		//声明类之后，就可以把它作为一个类型使用
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
