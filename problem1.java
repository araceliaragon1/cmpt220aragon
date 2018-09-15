import java.util.Scanner;

public class problem1 {

	private static int number1;
	private static int number2;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a number: ");
		number1 = input.nextInt();
		System.out.println("Give me another number: ");
		number2 = input.nextInt();
		
		if (number1 < number2) {
			System.out.println(number1 + " is LESS THAN " + number2);
		}
		
		if (number1 <= number2) {
			System.out.println(number1 + " is LESS THAN or EQUAL TO " + number2);
		}
		
		if (number1 == number2) {
			System.out.println(number1 + " is EQUAL TO " + number2);
		}
		
		if (number1 != number2) {
			System.out.println(number1 + " is NOT EQUAL TO " + number2);
		}
		
		if (number1 > number2) {
			System.out.println(number1 + " is MORE THAN " + number2);
		}
		
		if (number1 >= number2 ) {
			System.out.println(number1 + " is MORE THAN or EQUAL TO " + number2);
		}
	}

}
