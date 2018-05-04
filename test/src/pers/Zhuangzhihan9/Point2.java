// Fig. 9.9: Point2.java
// Point2 class declaration represents an x-y coordinate pair.

package pers.Zhuangzhihan9;

public class Point2 {
	protected int x; // x part of coordinate pair
	protected int y; // y part of coordinate pair
	
	// no-argument constructor
	public Point2(){
		// implicit call to Object constructor occurs here
	}
	
	// constructor
	public Point2(int xValue, int yValue){
		// implicit call to Object constructor occurs here
		x = xValue; // no need for validation
		y = yValue; // no need for validation
	}
	
	// set x in coordinate pair
	public void setX(int xValue) {
		x = xValue;	// no need for validation
	}
	
	// return x from coordinate pair
	public int  getX() {
		return x;
	}
	
	// set y in coordinate pair
	public void setY(int yValue) {
		y = yValue;	// no need for validation
	}
	
	// return y from coordinate pair
	public int  getY() {
		return y;
	}
	
	// return String representation of Point2 object
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
	
}// end class Point2
