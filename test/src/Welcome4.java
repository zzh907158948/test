// Fig. 2.6: Welcome4.java
// Printing multiple lines in a dialog box.

// Java packages
import javax.swing.JOptionPane; //program uses JOptionPane

public class Welcome4 {

   // main method begins execution of Java application
   public static void main ( String args[] )
   {
      JOptionPane.showMessageDialog(
        null, "Welcome\nto\nJava\nProgramming!" );

      System.exit(0); // terminate application with window

   } //end method main

 } // end class Welcome4