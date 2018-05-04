//Fig8.18:PackageDataTest.java
//Classes in the same package (i.e.the same dictionary)can use 
//package access data of other classes in the same package
import javax.swing.JOptionPane;

public class PackageDataTest {
	public static void main(String args[])
	{
		PackageData packageData=new PackageData();
		 //append String representation of packageData to output
		String output="After instantiation:\n"+packageData.toPackageDataString();
		packageData.toPackageDataString();
		
		//change package access data in packageData object
		packageData.number=77;
		packageData.string="Goodbye";
		
		//append String representation of packageData to output
		output+="\nAfter changing values:\n"+
		        packageData.toPackageDataString();
		
		JOptionPane.showMessageDialog(null, output,"Package Access",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	 }
	}  //end class PackageDataTest
	
     //class with package access instance variables
	class PackageData{
		int number;   //package-access instance variable
		String string; //package-access instance variable
		
		//constructor
		public PackageData()
		{
			number=0;
			string="Hello";
			
		}
		//return PackageData object String representationString
		public String toPackageDataString()
		{
			return "number:"+number+"    string :"+string;
		}
	}  //end class PackageData
