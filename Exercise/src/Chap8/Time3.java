package Chap8;

import java.text.DecimalFormat;

public class Time3 {
	private int hour;
	private int minute;
	private int second;
	
	//constructor
	public Time3()
	{
		setTime(0,0,0);
	}
	
	public Time3(int h)
	{
		setTime(h,0,0);
	}
	
	public Time3(int h, int m)
	{
		setTime(h,m,0);
	}
	
	public Time3(int h, int m, int s)
	{
		setTime(h,m,s);
	}
	
	public Time3(Time3 time)
	{
		setTime(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	public void setTime(int h, int m, int s) 
	{
		setHour(h);
		setMinute(m);
		setSecond(s);	
	}
	
	public void setHour(int h)
	{
		hour = ((h >= 0 && h < 24) ? h:0);
	}
	
	public void setMinute(int m)
	{
		minute = ((m >=0 && m < 60) ? m:0);
	}
	
	public void setSecond(int s)
	{
		second = ((s >=0 && s < 60) ? s:0);
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
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
