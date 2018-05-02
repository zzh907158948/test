package Chap6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Craps extends JApplet implements ActionListener {
	
	//定义三种状态，且被定义为不能改变的类型
	final int WON = 0, LOST = 1, CONTINUE = 2;
	
	boolean firstRoll = true;
	int sumOfDice = 0;//储存最后一次只投资的点数和
	int myPoint = 0;//储存玩家第一次掷既没赢也没输的点数
	int gameStatus = CONTINUE;//记录游戏状态
	
	//创建GUI组件对象
	JLabel die1Label, die2Label, sumLabel, pointLabel;//在屏幕中显示字符串的GUI组件
	JTextField die1Field, die2Field, sumField, pointField;//用于接收用户在键盘上输入的字符串和信息
	JButton rollButton;//按钮

	//创建GUI组件对象
	public void init() 
	{
		Container container = getContentPane();
		//将面板的布局设置为FlowLayout（一个布局管理器）,面板上增加的组件默认是按照从左到右顺序排列
		//把参数传给setLayout
		container.setLayout(new FlowLayout());
		
		//创造label和text field给骰子1
		die1Label = new JLabel("Die 1");//创建一个新的JLabel对象
		container.add(die1Label);//将die1label附加到applet的内容面板上
		die1Field = new JTextField(10);//创建一个新的JTextField对象，10个字符宽
		//使调用这个函数的控件不能被编辑，如果设为true或者不调用这个函数，则控件可以编辑
		die1Field.setEditable(false);//标明用户不能在JTextField中输入
		container.add(die1Field);//将die1Field加入applet的内容面板上
		
		//创造label和text field给骰子2
		die2Label = new JLabel("Die 2");
		container.add(die2Label);
		die2Field = new JTextField(10);
		die2Field.setEditable(false);
		container.add(die2Field);
		
		//创造label和text field给sum
		sumLabel = new JLabel("Sum is ");
		container.add(sumLabel);
		sumField = new JTextField(10);
		sumField.setEditable(false);
		container.add(sumField);
		
		//创造label和text field给point
		pointLabel = new JLabel("Point is ");
		container.add(pointLabel);
		pointField = new JTextField(10);
		pointField.setEditable(false);
		container.add(pointField);
		
		//创建一个按钮，点击可以开始掷骰子
		rollButton = new JButton("Roll Dice");//用“Roll Dice”初始化按钮
		rollButton.addActionListener(this);//没有这一句，applet就不会知道用户已经按了按钮
		container.add(rollButton);
 	}

	//处理用户与JBotton按钮之间的交互
		public void actionPerformed(ActionEvent actionEvent) 
		{
			sumOfDice = rollDice();
			
			if(firstRoll) {//如果是第一次掷就是true
				switch (sumOfDice) {
				case 7:
				case 11:
					gameStatus = WON;
					pointField.setText(" ");
					break;
				case 2:
				case 3:
				case 12:
					gameStatus = LOST;
					pointField.setText(" ");
				default:
					gameStatus = CONTINUE;
					myPoint = sumOfDice;
					pointField.setText(Integer.toString(myPoint));//转化成字符串，因为JTextField只能显示字符串
					firstRoll = false;
					break;
				}
			}
			else {
				if(sumOfDice == myPoint)
					gameStatus = WON;
				else {
					if(sumOfDice == 7)
						gameStatus = LOST;
				}
			}
			displayMessage();	
	}
		//掷两个骰子，计算并显示点数和
		public int rollDice() 
		{
			int die1 = 1 + (int) (Math.random() *6);
			int die2 = 1 + (int) (Math.random() *6);
			int sum = die1 + die2;
			
			die1Field.setText(Integer.toString(die1));
			die2Field.setText(Integer.toString(die2));
			sumField.setText(Integer.toString(sum));
			
			return sum;
		}
		
		//显示游戏当前状态
		public void displayMessage() 
		{
			if (gameStatus == CONTINUE)
				showStatus("Roll again.");//在applet的状态栏上显示一个字符串
			else {
				if(gameStatus == WON)
					showStatus("Player wins. Click Roll Dice to play again.");
				else 
					showStatus("Player loses. Click Roll Dice to play again.");
				
				firstRoll = true;//游戏结束后标记重新成true
			}
		}
}

