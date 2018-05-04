// Fig 6.8: RollDie.java
// Roll a six-sided die 6000 times.
import javax.swing.*;

public class RollDie {

   public static void main( String args[] )
   {
       int frequency1 = 0, frequency2 = 0, frequency3 = 0,
           frequency4 = 0, frequency5 = 0, frequency6 = 0, face;

      // summarize results
      for ( int roll = 1; roll <= 6000; roll++ ) {
         face = 1 + ( int ) ( Math.random() * 6 );

         // determine roll value and increment appropriate counter
         switch ( face ) {
           
            case 1:
              ++frequency1;
              break;

            case 2:
              ++frequency2;
              break;

            case 3:
              ++frequency3;
              break;

            case 4:
              ++frequency4;
              break;

            case 5:
              ++frequency5;
              break;

            case 6:
              ++frequency6;
              break;

          } // end switch

       } // end for

       JTextArea outputArea = new JTextArea();

       outputArea.setText( "Face\tFrequency" + "\n1\t" + frequency1 +
           "\n2\t" + frequency2 + "\n3\t" + frequency3 +
           "\n4\t" + frequency4 + "\n5\t" + frequency5 +
           "\n6\t" + frequency6 );

       JOptionPane.showMessageDialog( null, outputArea,
          "Rolling a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE );

       System.exit( 0 );  // terminate application

   } // end main

 } // end class RollDie