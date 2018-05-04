// Fig. 9.6: Circle.java
// Circle class contains x-y coordinate pair and radius

package pers.Zhuangzhihan9;

public class Circle {
	private int x; // x-coordinate of Circle's center
	private int y; // y-coordinate of Circle's center
	private double radius; // Circle's radius
	
	// no-argument constructor
	public Circle(){
		// implicit call to Object constructor occurs here
	}
	
	// constructor
	public Circle(int xValue, int yValue, double radiusValue){
		// implicit call to Object constructor occurs here
		x = xValue; // no need for validation
		y = yValue; // no need for validation
		setRadius(radiusValue);
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
	
	// set radius
	public void setRadius(double radiusValue) {
		radius = radiusValue;	// no need for validation
	}
	
	// return radius
	public double  getRadius() {
		return radius;
	}
	
	// calculate and return diameter
	public double getDiameter() {
		return 2 * radius;
	}
	
	// calculate and return circumference
	public double getCircumference() {
		return Math.PI * getDiameter();
	}
	
	// calculate and return area
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	// return String representation of Circle object
	public String toString() {
		return "[" + x + ", " + y + "]; Radius = " + radius;
	}
	
}// end class Circle
