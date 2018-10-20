
public class Square {
	public double width = 1; 
	
	public Square() {
		
	}
	
	public Square(double x) {
		width = x;
	//  Square sqr1 = new Square(40);
	}
	
	public double getArea() {
		double area = width * width;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = width * 4;
		return perimeter;
	}
	
}
