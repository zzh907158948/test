// Fig. 9.10: Circle3.java
// Circle3 class inherits from Point2 and has access to Point2
// protected members x and y.

package pers.Zhuangzhihan9;

public class Circle3 extends Point2{
	private double radius;	// Circle3's radius
	
	// no-argument constructor
	public Circle3(){
		// implicit call to Point2 constructor occurs here
	}
	
	// constructor
	public Circle3(int xValue, int yValue, double radiusValue){
		// implicit call to Point2 constructor occurs here
		x = xValue; // no need for validation
		y = yValue; // no need for validation
		setRadius(radiusValue);
	}
	
	// set radius
	public void setRadius(double radiusValue) {
		radius = (radiusValue < 0.0 ? 0.0 : radiusValue);
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
	
	// return String representation of Circle3 object
	public String toString() {
		return "Center = [" + x + ", " + y + "]; Radius = " + getRadius();
	}
	
}// end class Circle3
