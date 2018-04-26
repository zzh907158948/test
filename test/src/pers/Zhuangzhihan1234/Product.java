// Product.java 
// 计算并打印三个整数的乘积

// Java packages
package pers.Zhuangzhihan1234;
import javax.swing.JOptionPane;

public class Product {
	
	// main方法开始执行Java应用程序
	public static void main(String[] args) {
		String firstNumber;		// 用户输入的第一个字符串
		String secondNumber;	// 用户输入的第二个字符串
		String thirdNumber;	// 用户输入的第三个字符串
		
		int number1;		// 第一个乘数
		int number2;		// 第二个乘数
		int number3;		// 第三个乘数
		int product;			// 三个整数的乘积
		
		// 读取用户输入的第一个字符串
		firstNumber = JOptionPane.showInputDialog("Enter first integer");
		
		// 读取用户输入的第二个字符串
		secondNumber = 
			JOptionPane.showInputDialog("Enter second integer");
		
		// 读取用户输入的第三个字符串
				thirdNumber = 
					JOptionPane.showInputDialog("Enter third integer");
		
		// 把字符串转换为整型
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		number3 = Integer.parseInt(thirdNumber);
		
		// 把三个整数相乘
		product = number1 * number2 * number3;
		
		//展示结果
		JOptionPane.showMessageDialog(null, "The result is " + product,
				"Results", JOptionPane.PLAIN_MESSAGE );
		
		System.exit(0);  //从图形化界面终止应用程序
	
	}// 结束main方法

}// 结束类Product


