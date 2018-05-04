//Fig.8.5:Time2.java
//Time2 class declaration with overloaded constructors
import java.text.DecimalFormat;

public class Time2 {
	private int hour;   //0-23
	private int minute;  //0-59
	private int second;  //0-59
	
	//Time2 constructor initializes each instance variables to zero
	//ensures that Time object starts in a consistent state
	
	public Time2()
	{
		this(0,0,0);  //invoke TIme2 constructor with three arguments
	}
	
	//Time2 constructor:hour supplied ,minute and second defaulted to 0
	public Time2(int h)
	{
		this(h,0,0);  //invoke time2 constructor with three arguments
	}
	
	//Time2 constructor:hour and minute supplied ,second defaulted to 0
	public Time2(int h,int m)
	{
		this(h,m,0);  //invoke time2 constructor with three arguments
	}
	
	//Time2 constructor:hour minute and second supplied
	public Time2(int h,int m,int s) 
	{
		setTime(h, m, s);  //invoke time2 constructor with three arguments
	}
	
	//Time2 constructor:another Time2 object supplied
	public Time2(Time2 time)
	{
		//invoke time2 constructor with three arguments
		this(time.hour,time.minute,time.second);
	}
	
	//set a new time value using universal time;perform validity checks on the data;set
	//invalid values to zero
	public void setTime(int h,int m,int s)
	{
		hour=((h>=0&&h<24)?h:0);
		minute=((m>=0&&m<60)?m:0);
		second=((s>=0&&s<60)?s:0);
	}
			
	//convert to String in universal-time format
	public String toUniversalString()
	{
		DecimalFormat twoDigits=new DecimalFormat();
		 return twoDigits.format(hour)+":"
				+twoDigits.format(minute)+":"+twoDigits.format(second);
		 
	}
	
	//convert to String in standard-time format
	public String toStandardString()
	{
		DecimalFormat twoDigits=new DecimalFormat("00");
		return ( (hour==12||hour==0)?12:hour%12)+":"+
				twoDigits.format(minute)+":"+twoDigits.format(second)
				+(hour<12?"AM":"PM");
		
	}

	
}//end class Time2
