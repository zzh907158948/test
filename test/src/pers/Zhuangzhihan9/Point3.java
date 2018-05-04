// Fig. 9.12: Point3.java
// Point class declaration represents an x-y coordinate pair.

package pers.Zhuangzhihan9;

public class Point3 {
	private int x; // x part of coordinate pair
	private int y; // y part of coordinate pair
	
	// no-argument constructor
	public Point3(){
		// implicit call to Object constructor occurs here
	}
	
	// constructor
	public Point3(int xValue, int yValue){
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
	
	// return String representation of Point3 object
	public String toString() {
		return "[" + getX() + ", " + getY() + "]";
	}
	
}// end class Point3
