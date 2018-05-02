package Chap5;

import java.text.NumberFormat;//一个确定哪个语言环境具有数值格式及名字的方法
import java.util.Locale;//软件的本地化时使用。它本身没有什么功能，
					//更多的是作为一个参数辅助其他方法完成输出的本地化。

import javax.swing.JOptionPane;
import javax.swing.JTextArea;//文本区

public class Interest {

	public static void main(String[] args) {
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		
		//在NumberFormat类中为我们提供了格式化4种数字的方法：整数、小数、货币和百分比
		//以参数Locale对象所指定的环境来获得处理货币的NumberFormat实例对象。
		//getCurrencyInstance返回一个能将数字值格式化成货币值形式的NumberFormat对象
		NumberFormat moneyFormat = NumberFormat.
				getCurrencyInstance(Locale.US);
		
		//JTextArea（一个有多行文本显示能力的GUI组件）本身默认的是不换行，不滚动条显示。
		//创建一个文本区outputTextArea去展示输出
		//放置文本的方式setText和append
		JTextArea outputTextArea = new JTextArea();
		
		//设置outputTextArea的第一行
		outputTextArea.setText("Year\tAmount on seposit\n");
		
		for(int year = 1; year <= 10; year++) 
		{
			//Math.pow(a,b)，a:底数，b:几次方
			//moneyFormat.format(amount)-将amount格式转化为美元格式
			amount = principal * Math.pow(1.0 +rate, year);
			outputTextArea.append(year + "\t" +
			moneyFormat.format(amount) +"\n");
		}
		JOptionPane.showMessageDialog(null, outputTextArea, 
				"Compound Interest", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);//terminate
	}

}
