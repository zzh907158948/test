//Fig.7.15:DoubleArray.java
//Two-dimensional array example
import java.awt.*;

import javax.swing.*;

public class DoubleArray  extends JApplet{
	int grades[][]={{77,68,86,73},
			{96,87,89,86,73},{70,90,86,81}};
	int students,exams;
	String output;
	JTextArea outputArea;
	
	//initialize fields
	public void init(){
		students=grades.length;  //number of students
		exams=grades[0].length;  //number of exams
		
		//create JTextArea and attach to applet
		outputArea=new JTextArea();
		Container container=getContentPane();
		container.add(outputArea);
		
		//build output string
		output="The array is:\n"; 
		buildString();
		
		//call methods minimum and maxinmum
		output+="\n\nLowest grade:"+minimum()+"\nHighest grade:"+maximum()+"\n";
		 
		//call method average to calculate each student's average
		for (int counter = 0; counter < students; counter++)
			output+="\nAverage for students "+counter+"is"+average(grades [counter]);  //pass one row of array grade
		
		//change outputArea's display font
		outputArea.setFont(new Font("Monospaced",Font.PLAIN,12));
		
		//Place output string in outputArea
		outputArea.setText(output);
	}  //end method init
	
	//find minimum grade
	public int minimum()
	{
		//assume first elements of grades array is smallest
		int lowGrade=grades[0][0];
		
		//loop through rows of grades array
		for (int row = 0; row < students; row++) 
			
			//loop through colunms of current row
			for (int column = 0; column < exams; column++)
				
				//if grade is less than lowGrade,assign it to lowGrade
				if (grades[row][column]<lowGrade) 
					lowGrade=grades[row][column];
		return lowGrade;   //return lowest grade
		
	}  //end method minimum
	
	//find maximum grade
	public int maximum()
	{
		//assume first elements of grades array is largest
				int highGrade=grades[0][0];
				
				//loop through rows of grades array
				for (int row = 0; row < students; row++) 
					
					//loop through colunms of current row
					for (int column = 0; column < exams; column++)
						
						//if grade is greater than highGrade,assign it to highGrade
						if (grades[row][column]>highGrade) 
							highGrade=grades[row][column];
				return highGrade;   //return highest grade
	}  //end method maximum
	
	//determine average grade for particular student (or set of grades)
	public double average(int setOfGrades[])
	{
		int total=0;   //initialize total
		
		//sum grades for one student
		for (int count = 0; count < setOfGrades.length; count++) 
			total+=setOfGrades[count];
		
		
		//return average of grades
		return (double) total /setOfGrades.length;
		
	}//end method average
   
	//build output string
	
	public void buildString(){
		output+="         ";  //used to align column heads
		 //create column heads
		for (int counter = 0; counter < exams; counter++) 
	     output+="["+counter+"] ";
		
		//create rows/columns of text representing array grades
		for (int row = 0; row < students; row++) {
			output+="\ngrades["+row+"] ";
			
			for (int column = 0; column < exams; column++) 
	          output+=grades[row][column]+"  ";
		}
		
	}  //end method buildingString

} //end class DoubleArray
