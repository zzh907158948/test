// Fig. 3.9: WelcomeApplet2.java
// Displaying multiple strings in an applet

// Java packages
import java.awt.Graphics;     // import class Graphics
import javax.swing.JApplet;   // import class JApplet

public class WelcomeApplet2 extends JApplet {

   // draw text on applet background
   public void paint ( Graphics g )
   {
      // call superclass version of method paint
      super.paint( g );

      // draw two Strings at different locations
      g.drawString( "Welcome to", 25, 25 );
      g.drawString( "Java Programming!", 25, 40 );

   } // end method paint

 } // end class WelcomeApplet2