import java.util.Scanner;

public class TriangleTestMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a measurement for side1, side2 and side3: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		Triangle tri1 = new Triangle(side1, side2, side3);
		
		System.out.println("Give me a color: ");
		String color = input.next();
		tri1.setColor(color);
		
		System.out.println("Is the tringle filled? ");
		boolean isFilled = input.nextBoolean();
		tri1.setFilled(isFilled);
		
		System.out.println("The area of the triangle is: " + tri1.getArea());
		System.out.println("The perimeter of the triangle is: " + tri1.getPerimeter());
		System.out.println(tri1.getColor());
		System.out.println(tri1.isFilled());
		input.close();
	}

}
