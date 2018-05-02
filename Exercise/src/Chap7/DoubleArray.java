package Chap7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DoubleArray extends JApplet 
{
	int grades[][] = {{77,68,86,73},
					 {96,87,89,81},
					 {70,90,86,81}};
	int students, exams;
	String output;
	JTextArea outputArea;
	
	//初始化
	public void init() 
	{
		students = grades.length;
		exams = grades[0].length;
		
		//创建JTextArea，储存在container
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		output = "The array is:\n";
		buildString();//调用buildString方法
		
		//调用minimum和maximum
		output += "\n\nLowest grade: " + minimum() + "\nHightest grade: " + 
					maximum() + "\n";
		
		for(int counter = 0; counter < students; counter++)
			output += "\nAverage for students " + counter + " is "
			+ average(grades[counter]);
		
		outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		outputArea.setText(output);
		
	}
	public int minimum() 
	{
		int lowGrade = grades[0][0];
		for(int row = 0; row < students; row++)
		{
			for(int column = 0; column < exams; column++)
			{
				if (grades[row][column] < lowGrade)
					lowGrade = grades[row][column];
			}
		}
		return lowGrade;
	}
	
	public int maximum() 
	{
		int highGrade = grades[0][0];
		for(int row = 0; row < students; row++)
		{
			for(int column = 0; column < exams; column++)
			{
				if (grades[row][column] > highGrade)
					highGrade = grades[row][column];
			}
		}
		return highGrade;
	}
	
	public double average(int setOfGrades[]) 
	{
		int total = 0;
		for(int counter = 0; counter < setOfGrades.length; counter++)
			total += setOfGrades[counter];
		
		return (double)total/setOfGrades.length;
	}
	
	//构造output
	public void buildString() 
	{    
		output += "          ";
		for(int counter = 0; counter < exams; counter++)
			output += "[" + counter + "] ";
		for (int row = 0; row < students; row++) 
		{
			output += "\ngrades[" + row + "] ";
			for (int column = 0; column < exams; column++) 
			output += grades[row][column] +"  ";
		}
		
	}
}
