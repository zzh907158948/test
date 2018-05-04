// Fig. 2.20: Comparison.java
// Compare integers using if statements, relational operators
// and equality operators.

// Java packages
import javax.swing.JOptionPane;

public class Comparison{
  
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      String firstNumber; // first string entered by user
      String secondNumber; // second string entered by user
      String result;      // a string containing the output

      int number1;        // first number to compare
      int number2;        // second number to compare

      // read first number from user as a string
      firstNumber = JOptionPane.showInputDialog( "Enter first integer:" );

      // read second number from user as a atring
      secondNumber = 
         JOptionPane.showInputDialog( "Enter second integer:" );

      // convert numbers from type String to type int
      number1 = Integer.parseInt( firstNumber );
      number2 = Integer.parseInt( secondNumber );

      // initialize result to empty String
      result = "";

      if ( number1 == number2 )
         result = result + number1 + " == " +number2;

      if ( number1 != number2 )
         result = result + number1 + " != " +number2;

      if ( number1 < number2 )
         result = result + "\n" + number1 + " < " +number2;

      if ( number1 > number2 )
         result = result + "\n" + number1 + " > " +number2;

      if ( number1 <= number2 )
         result = result + "\n" + number1 + " <= " +number2;

      if ( number1 >= number2 )
         result = result + "\n" + number1 + " >= " +number2;

      // Display results
      JOptionPane.showMessageDialog( null, result, "Comparison Results",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 ); // terminate application

   } // end method main

 } // end class Comparison