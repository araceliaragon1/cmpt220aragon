// Lab 5 - Problem 3

import java.util.Arrays;
import java.util.Scanner;

public class SortedListofStudents {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int number = input.nextInt();
		String[] names = new String[number];
		int[] array = new int[number];
		for(int i = 0;i < number; i ++) {
			System.out.print("Enter the students' name: ");
			names[i] = input.next();
			System.out.print("Enter the students' score: ");
			array[i] = input.nextInt();
		}
		selectionSort(names, array);
		System.out.print("The students name from lowest to highest scores are: " + Arrays.toString(names));
	}
	public static void selectionSort(String[] names, int[] array) {
		for(int i = array.length - 1; i >= 1; i--) {
			String temp;
			int currentMax = array[0];
			int currentMaxIndex = 0;
			for(int k = 1; k <= i; k++) {
				if (currentMax <= array[k]) {
					currentMax = array[k];
					currentMaxIndex = k; 
				}
			}
			if(currentMaxIndex != i) {
				temp = names[currentMaxIndex];
				names[currentMaxIndex] = names[i];
				names[i] = temp;
				array[currentMaxIndex] = array[i];
				array[i] = currentMax;
			}
		}
	}
}
