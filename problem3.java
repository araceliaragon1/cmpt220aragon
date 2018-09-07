package lab1;

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of ounces: ");
		double ounces = input.nextDouble();
		double grams = 28.3495 * ounces;
			System.out.println("There are: " +grams);

	}

}
