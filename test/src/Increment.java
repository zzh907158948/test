// Fig. 4.14: Increment.java
// Preincrementing and postincrementing operators.

public class Increment {
	
	public static void main ( String args[] )
	{
		int c;
		
		// demonstrate postincrement
		c = 5;                     // assign 5 to c
		System.out.println( c );   // print 5
		System.out.println( c++ ); // print 5 then postincrement
		System.out.println( c );   // print 6
		
		System.out.println();      // skip a line
		
		// demonstrate preincrement
		c = 5;                     // assign 5 to c
		System.out.println( c );   // print 5
		System.out.println( ++c ); // preincrement then print 6
		System.out.println( c );   // print 6
				
	} // end main
	
} // end class Increment