// Lab 4 - Problem 6

import java.util.Arrays;

public class PositiveArray {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		last(numbers);
		
		System.out.println(Arrays.toString(numbers) + "-1");
		set(3, 10, numbers);
		set(7, 100, numbers);
		System.out.println(Arrays.toString(numbers) + "-1");
	}
	
	public static void last(int[] array) {
		for(int i = 0, j = 1; i < 10; i++, j++) {
			array[i] = j;
		}
	}
	
	public static void set(int pos, int num, int[] array) {
		array[pos] = num;
	}

}
