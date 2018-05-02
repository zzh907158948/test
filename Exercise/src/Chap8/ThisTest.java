package Chap8;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.SimpleTimeZone;

public class ThisTest {

	public static void main(String[] args) 
	{
		SimpleTime time = new SimpleTime(12, 30, 19);
		
		JOptionPane.showMessageDialog(null, time.buildString(),
				"Demostrating the \"this\" Reference", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}

class SimpleTime
{
	private int hour;
	private int minute;
	private int second;
	
	public SimpleTime(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String buildString()
	{
		return "this.toStandardString(): " + this.toStandardString() + 
				"\ntoStandardString(): " + toStandardString();
	}
	
	public String toStandardString()
	{
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		return twoDigits.format(this.hour) + ":" + 
		twoDigits.format(this.minute) + ":" +
		twoDigits.format(this.second);
	}
}
