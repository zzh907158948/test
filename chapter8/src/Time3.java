//Fig.8.7:Time3.java
//Time3 class declaration with set and get methods
import java.text.DecimalFormat;

public class Time3 {
	private int hour;   //0-23
	private int minute;  //0-59
	private int second;  //0-59
	
	//Time3 constructor initialize each instance variable to zero
	//ensures that Time3 object starts in a consistent state
	public Time3()
	{
		this(0,0,0);  //invoke TIme3 constructor with three arguments
	}
	
	//Time3 constructor:hour supplied ,minute and second defaulted to 0
	public Time3(int h)
	{
		this(h,0,0);  //invoke time3 constructor with three arguments
	}
	
	//Time3 constructor:hour and minute supplied ,second defaulted to 0
	public Time3(int h,int m)
	{
		this(h,m,0);  //invoke time3 constructor with three arguments
	}
	
	//Time3 constructor:hour minute and second supplied
	public Time3(int h,int m,int s) 
	{
		setTime(h, m, s);  //invoke time3 constructor with three arguments
	}
	
	//Time3 constructor:another Time3 object supplied
	public Time3(Time3 time)
	{
		//invoke time3 constructor with three arguments
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	
	//set methods
	//set a new time value using universal time;perform 
	//validity checks on data;set invalid values to zero
	public void setTime(int h,int m ,int s)
	{
		setHour(h);   //set the hour
		setMinute(m);  //set the minute
		setSecond(s);   //set the second
	}
	
	//validate and set hour
	public void setHour(int h)
	{
		hour=((h>=0&&h<24)?h:0);
	}
	
	//validate and set minute
	public void setMinute(int m)
	{
		minute=((m>=0&&m<60)?m:0);
	}
	//validate and set hour
	public void setSecond(int s)
	{
		hour=((s>=0&&s<60)?s:0);
	}
	
	//get methods
	//get hour value
	public int getHour()
	{
		return hour;
	}
	//get minute value
	public int getMinute()
	{
		return minute;
	}
	//get second value
	public int getSecond()
	{
		return second;
	}
	
	//convert to string in universal-time format
	public String toUniversalString()
	{
		DecimalFormat twoDigits=new DecimalFormat();
		
		return twoDigits.format(getHour())+":"+
		twoDigits.format(getMinute())+":"+
				twoDigits.format(getSecond());
		
	}
	//convert to string in standard-time format
	public String toStandardString()
	{
		DecimalFormat twoDigits=new DecimalFormat();
		return ((getHour()==12||getHour()==0)?
				12:getHour()%12)+":"+twoDigits.format(getMinute())+":"+twoDigits.format(getSecond())
				+(hour<12?"AM":"PM");
		
	}
	

}  //end class
