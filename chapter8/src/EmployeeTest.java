//Fig.8.13:EmployeeTest.java
//Test Employee class with static class variable
import  javax.swing.*;

public class EmployeeTest {
	
	public static void main(String args[])
	{
		//prove that count is 0 before creating Employees
		String output="Employees before instantiation:"+
		Employee.getCount();
		
		//create two  Employees ;count should be 2
		Employee e1=new Employee("Susan", "Baker");
		Employee e2=new Employee("Bob", "Jones");
		
		//prove that count is 2 after creating two Employees
		output+="\n\nEmployees after instantiation "+
		"\nvia e1.getCount():"+e1.getCount()+
		"\nvia e1.getCount():"+e1.getCount()+
		"\nvia Employee.getCount():"+Employee.getCount();
		
		//get names of Employees
		output+="\nEmployee 1:"+e1.getFirstName()+" "+e1.getLastName()+
				"\nEmployee 2:"+e2.getFirstName()+" "+e2.getLastName();
		
		//decrement reference count for each Emplyee object;in this example,there is only one reference
		//to each employee ,so these statements mark each Employee object for garbage collection
		e1=null;
		e2=null;
		
		System.gc();  //suggest call to garbage collector
		
		//show Employee count after calling garbage collector;count displayed
		//may be 0,1 or 2 based on  whether garbage collector executes immediately and number of Employee
		//objects collected
		output+= "\n\nEmployees after System.gc():"+Employee.getCount();
		
		JOptionPane.showMessageDialog(null, output,"Static Members",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
		

}

}//END CLASS
