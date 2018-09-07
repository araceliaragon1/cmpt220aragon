package lab1;

import java.util.Scanner;

public class problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the mass in kilograms: ");
		double mass = input.nextDouble();
		double speedOfLight = 28.3495 * mass;
			System.out.println("The energy is: " + speedOfLight + " when the mass is " + mass);

	}

}
