// Fig. 5.7: DoWhileTest.java
// Using the do...while statement.
import java.awt.Graphics;

import javax.swing.JApplet;

public class DoWhileTest extends JApplet {
   
   // draw lines on applet
   public void paint( Graphics g )
   {
      super.paint( g ); // call paint method inherited from JApplet

      int counter = 1;  // initialize counter

      do {
         g.drawOval( 110 - counter * 10, 110 - counter * 10,
           counter * 20, counter * 20 );
         ++counter;
      } while( counter <= 10 ); // end do...while

   } // end method paint

 } // end class DoWhileTest