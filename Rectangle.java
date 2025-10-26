public class Rectangle {
	//According to Piazza we dont need to use point so we
	//define rectangle as the following
	double length; 
	double width;
	

	//Default rectangle: 1x1 square 
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	//Unique rectangle: created by user
	//Note we take length and width to be non negative 
	//values meaning we take the abs value of the given 
	//dimensions even if a negative value is given
	//Zero dimensions are allow and are treated as dist from origin 
	//(for simplicity we'll use the MATB41 defn of a rectangular region)
	public Rectangle(double length, double width)
	{
		this.length = Math.abs(length);
		this.width = Math.abs(width);
	}
	
	//Calculate perimeter of rectangle
	//If one of the dimensions is 0 we'll calulate as the other dimension * 2
	//We'll use the MATB41 defn of an enclose region and treat it line distance
	//from the origin
	public double perimeter()
	{
		return 2*this.length + 2*this.width;
	}
	
	//Calculate area of rectangle
	public double area()
	{
		return this.length * this.width;
	}
	
	//Check if a given rectangle is a square
	public boolean isSquare()
	{
		return Math.abs(this.length - this.width) < 1e-9;
	}

}
