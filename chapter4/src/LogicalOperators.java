//Fig.5.19:LogicalOperators.java
//Logical operators.
import javax.swing.*;

public class LogicalOperators {
	public static void main(String args[])
	{
		//create JTextArea to diaplay results
		JTextArea outputArea=new JTextArea(17,20);
		
		//attach JTextArea to a JScrollPane so user canscroll results
		JScrollPane scroller=new JScrollPane(outputArea);
		
		//create truth table for &&(conditional AND) operator
		String output="Conditional AND(&&)"+
		"\nfalse && false: "+(false&&false)+
		"\nfalse && true: "+(false&&true)+
		"\ntrue && false: "+(true&&false)+
		"\ntrue && true:"+(true&&true);
		
		//create truth table for ||(conditional OR) operator
		output+="\n\nConditional OR(||)"+
		"\nfalse || false: "+(false||false)+
		"\nfalse || true: "+(false||true)+
		"\ntrue || false: "+(true||false)+
		"\ntrue || true:"+(true||true);
		
		//create truth table for &(boolean logical AND) operator
		output+="\n\nboolean logical AND(&)"+
		"\nfalse & false: "+(false&false)+
		"\nfalse & true: "+(false&true)+
		"\ntrue & false: "+(true&false)+
		"\ntrue & true:"+(true&true);
		
		//create truth table for |(boolean logical inclusive OR) operator
		output+="\n\nboolean logical inclusive(|)"+
		"\nfalse | false: "+(false|false)+
		"\nfalse | true: "+(false|true)+
		"\ntrue | false: "+(true|false)+
		"\ntrue | true:"+(true|true);

		//create truth table for ^(boolean logical exclusive OR) operator
		output+="\n\nboolean logical exclusive(^)"+
		"\nfalse ^ false: "+(false^false)+
		"\nfalse ^ true: "+(false^true)+
		"\ntrue ^ false: "+(true^false)+
		"\ntrue ^ true:"+(true^true);
		
		//create truth table for !(logical negation) operator
		output+="\n\nlogical negation(!)"+
		"\n!false: "+(!false)+
		"\n!true: "+(!true);
		
		outputArea.setText(output);  //place results in JTextArea
		
		JOptionPane.showMessageDialog(null, scroller,
				"Truth Tables",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0); //terminate application
		
	}//end main

}//end class LogicalOperator
