//记录掷骰子6000次，每一面出现的次数
package Chap7;

import javax.swing.*;

public class RollDie {

	public static void main(String[] args) {
		int frequency[] = new int[7];//frequency代表6面
		
		//roll掷6000次
		for(int roll = 1; roll <= 6000; roll++)
			++frequency[1 + (int)(Math.random()*6)];//frequency一样的数组+1
		String output = "Face\tFrequency";
		for(int face = 1; face < frequency.length; face++)
			output += "\n" +face +"\t" + frequency[face];
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, 
				"Roling a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
