package Chap6;
import java.awt.Container;//数据容器，存放了我们随时可能需要使用到的对象引用，
					//所以一般的数据容器要都要能能提供方便的查询、遍历、修改等基本接口功能。
import javax.swing.*;

public class SquareIntegers extends JApplet {
	public void init() {
		JTextArea outputArea = new JTextArea();
		//初始化一个容器，有返回值，返回的是Container对象
		Container container = getContentPane();
		//把outputArea赋值给container
		container.add(outputArea);
		int result;
		String output = "";
		
		for(int counter=1; counter<=10; counter++) {
			result = square(counter);
			output += "The suare of " + counter + " is " + result + "\n";
		}
		////用setText方法将outputText里的文本替换成output
		outputArea.setText(output);
	}
	//Square方法
	public int square(int y) {
		return y*y;
	}
}
