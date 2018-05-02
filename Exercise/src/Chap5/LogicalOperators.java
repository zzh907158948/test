package Chap5;

import javax.swing.*;

public class LogicalOperators {

	public static void main(String[] args) {
		//创造一个JTextArea去展示输出（长为x，宽为y）
		JTextArea outputArea = new JTextArea(17,20);
		//JScrollPane是带有滚动条的面板。JScrollPane是Container类的子类
		//也是一种容器，但是只能添加一个组件。
		JScrollPane scroller = new JScrollPane(outputArea);
		//开始构建output
		//&& operator
		String output = "Conditional AND (&&)" + "\nfalse && false: " +
						(false && false) + "\nfalse && true: " + (false && true)
						+ "\ntrue && false: " + (true && false) + "\ntrue && true"
						+ (true && true);
		//|| operator
		output += "\n\nConditional OR (||)" + "\nfalse || false: " + (false || false)
				+ "\nfalse || true: " + (false || true) + "\ntrue || false"
				+ (true || false) + "\ntrue || true: " + (true || true);
		//& operator
		output += "\n\nBoolean logical AND (&)" + "\nfalse & false: " + (false & false)
				+ "\nfalse & true: " + (false & true) + "\ntrue & false: " + (true & false)
				+ "\ntrue & true: " + (true & true);
		//| operator
		output += "\n\nBoolean logical inclusive OR (|)" + "\nfalse | false: " + (false | false)
				+ "\nfalse | true: " + (false | true) + "\ntrue | false: " + (true | false)
				+ "\ntrue | true: " + (true | true);
		//^ operator
		output += "\n\nBoolean logical exclusive OR (^)" + "\nfalse ^ false: " + (false ^ false)
				+ "\nfalse ^ true: " + (false ^ true) + "\ntrue ^ false: " + (true ^ false)
				+ "\ntrue ^ true: " + (true ^ true);
		//! operator
		output += "\n\nlogical NOT (!)" + "\n!false: " + (!false) + 
				"\n!true" + (!true);
		//用setText方法将outputText里的文本替换成output
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, scroller, "Truth Tables", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
