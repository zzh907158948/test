// Fig. 7.7: RollDie7.java
// Roll a six-sided die 6000 times.
import javax.swing.*;

public class RollDie7 {

   public static void main ( String args[] )
   {
      int frequency[] = new int[ 7 ];

      // roll die 6000 times; use die values as frequenc index
      for ( int roll = 1; roll <= 6000; roll++ )
         ++frequency[ 1 + ( int ) ( Math.random() * 6 ) ];

      String output = "Face\tFrequency";

      // append frequencies to String output
      for ( int face = 1; face < frequency.length; face++ )
         output += "\n" + face + "\t" + frequency[ face ];

      JTextArea outputArea = new JTextArea();
      outputArea.setText( output );

      JOptionPane.showMessageDialog( null, outputArea, 
         "Rollinng a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   } // end main

 } // end class RollDie7