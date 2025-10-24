package lab5;


public class Circle {
	double radius;
	
	//Creates a Unit circle centered at (0,0).
	public Circle() {
		this.radius = 1.0;
	}
	
	//Creates a circle with absolute value of given radius.
	public Circle(double radius) {
		this.radius = Math.abs(radius);
	}

	
	//Calculates and returns the perimeter of Circle.
	public double Perimeter() {
		return (2 * Math.PI * radius);
	}
	
	//Calculates and returns the area of Circle.
	public double Area() {
		return Math.PI * (radius * radius);
	}
	
	//Determines whether the circle is a unit circle or not.
	public boolean isUnitCircle() {
		if(this.radius == 1.0)
			return true;
		
		return false;
	}
	
}
