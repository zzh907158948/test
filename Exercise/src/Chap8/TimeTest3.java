package Chap8;
import javax.swing.*;

public class TimeTest3 {
	public static void main(String[] args)
	{
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21,34);
		Time2 t4 = new Time2(12,25,42);
		Time2 t5 = new Time2(27,74,99);
		Time2 t6 = new Time2(t4);
		
		String output = "Constructed with: " + "\nt1: all arguments defaluted"
		+ "\n   " + t1.toUniversalString() + "\n   " + t1.toStandardString();
		
		output += "\nt2: hour specified; minute and second defaulted" + 
		"\n   " + t2.toUniversalString() + "\n   "+ t2.toStandardString();
		
		output += "\nt3: hour and minute specified; second defaulted" + 
				"\n   " + t3.toUniversalString() + "\n   "+ t3.toStandardString();
	
		output += "\nt4: hour, minute and second specified" + 
				"\n   " + t4.toUniversalString() + "\n   "+ t4.toStandardString();
	
		output += "\nt5: all invalid values specified" + 
				"\n   " + t5.toUniversalString() + "\n   "+ t5.toStandardString();
	
		output += "\nt6: Time2 object t4 specified" + 
				"\n   " + t6.toUniversalString() + "\n   "+ t6.toStandardString();
		
		JOptionPane.showMessageDialog(null, output,
				"Overloaded Constructors", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
