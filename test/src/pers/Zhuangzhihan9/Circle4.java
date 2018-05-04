// Fig. 9.13: Circle4.java
// Circle4 class inherits from Point3 and accesses Point3's
// private x and y via Point3's public methods.

package pers.Zhuangzhihan9;

public class Circle4 extends Point3{
	private double radius;	// Circle4's radius
	
	// no-argument constructor
	public Circle4(){
		// implicit call to Object constructor occurs here
	}
	
	// constructor
	public Circle4(int xValue, int yValue, double radiusValue){
		// implicit call to Object constructor occurs here
		super(xValue, yValue);	// call Point3 constructor explicitly
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
	
	// return String representation of Circle4 object
	public String toString() {
		return "Center = " + super.toString() + "; Radius = " + getRadius();
	}
	
}// end class Circle4
