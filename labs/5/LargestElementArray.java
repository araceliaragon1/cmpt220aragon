// Lab 5 - Problem 1

/*import java.util.Scanner;

public class LargestElementArray {

	public static void main(String[] args) {
		double[] array;
		
		double max(double[]array);
	}
	
	public static double max (double[] array) {
		array = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a list of 10 numbers: ");
		for (double i = 0; i < 10; i++) {
			array[10] = input.nextDouble();
		}
		return 0;	
	}
	
}
// getMaxValue(array);*/


import java.util.*;
public class LargestElementArray{
    public static void main(String args[]){
        int[] array = new int[10];
        // new int[10] - how many integers there should be 
        Scanner in = new Scanner(System.in);
        int i, min=0, max=0;
        for(i=0; i < 10; i++){ // JA
            System.out.print("Enter any number: ");
            array[i] = in.nextInt();          
        }
        min = array[0];
        for(i=0; i<=9; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);
    }
}