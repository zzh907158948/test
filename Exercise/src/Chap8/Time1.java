//创建代表时间的对象
package Chap8;

import java.text.DecimalFormat;

public class Time1 extends Object
{
	private int hour;
	private int minute;
	private int second;
	
	//constructor构造函数，初始化每个instance variable的值为0
	public Time1()
	{
		setTime(0,0,0);
	}
	
	//设置时间值，并把不正确的值设置为0
	public void setTime(int h, int m, int s)
	{
		hour = ((h >= 0 && h < 24) ? h:0);
		minute = ((m >=0 && m < 60) ? m:0);
		second = ((s >=0 && s < 60) ? s:0);
	}
	
	public String toUniversalString() 
	{
		//DecimalFormat 是 NumberFormat 的一个具体子类，用于格式化十进制数字
		DecimalFormat twoDigits = new DecimalFormat("00");
		return twoDigits.format(hour) + ":" + twoDigits.format(minute)
		+ ":" + twoDigits.format(second);
	}
	
	public String toStandardString() 
	{
		DecimalFormat twoDigits = new DecimalFormat("00");
		return ((hour == 12 || hour == 0) ? 12 : hour%12) + ":" +
				twoDigits.format(minute) + ":" +twoDigits.format(second)
				+ (hour < 12 ? " AM" : " PM");
	}
	
}
