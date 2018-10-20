
public class SquareTestMain {
	public static void main(String[] args) {
		Square sqr1 = new Square(40);
		Square sqr2 = new Square(35.9);
		
		System.out.println("Width of Square 1: " + sqr1.width);
		System.out.println("Area of Square 1: " + sqr1.getArea());
		System.out.println("Perimeter of Square 1: " + sqr1.getPerimeter());
		System.out.println();
		System.out.println("Width of Square 2: " + sqr2.width);
		System.out.println("Area of Square 2: " + sqr2.getArea());
		System.out.println("Perimeter of Square 2: " + sqr2.getPerimeter());
	}

}
