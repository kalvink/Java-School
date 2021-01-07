package class_and_objects;

/**
 * Circle class.
 */
public class Circle {
	private static final double PI = 3.14; //class constant
	private double radius; //instance variable

	/**
	 * constructor pre: none post: A Circle object created. Radius initialized
	 * to 1.
	 */
	public Circle() {
		radius = 1; // default radius
	}
	
	/**
	 * constructor pre: none post: A Circle object created with radius r.
	 */
	
	public Circle(double r) {
		radius = r;
	}
	
	/**
	 * Changes the radius of the circle. pre: none post: Radius has been
	 * changed.
	 */
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	/**
	 * Returns the radius of the circle. pre: none post: The radius of the
	 * circle has been returned.
	 */
	public double getRadius() {
		return (radius);
	}

	/**
	 * Returns the radius of the circle. pre: none post: The radius of the
	 * circle has been returned.
	 */
	public double circumference() {
		return (2 * PI * radius);
	}

}