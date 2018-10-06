// Lab 5 - Problem 2

import java.util.Scanner;

public class MeanAndStandardDeviation {
	public static void main (String[] args){
   Scanner input = new Scanner (System.in);

   double num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0, total = 0, mean = 0, stDev1 = 0, stDev2 = 0, sum = 0;

   System.out.println("Enter 10 numbers: ");
   num1 = input.nextDouble();
   num2 = input.nextDouble();
   num3 = input.nextDouble();
   num4 = input.nextDouble();
   num5 = input.nextDouble();
   num6 = input.nextDouble();
   num7 = input.nextDouble();
   num8 = input.nextDouble();
   num9 = input.nextDouble();
   num10 = input.nextDouble();

   sum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;

   mean = sum / (double) 10;

   stDev1 = Math.pow(num1 - mean, 2) + Math.pow(num2 - mean, 2) + Math.pow(num3 - mean, 2) + Math.pow(num4 - mean, 2) + Math.pow(num5 - mean, 2) + 
   Math.pow(num6 - mean, 2) + Math.pow(num7 - mean, 2) + Math.pow(num8 - mean, 2) + Math.pow(num9 - mean, 2) + Math.pow(num10 - mean, 2);

   stDev2 = Math.sqrt(stDev1 / 10);

   System.out.println ("The mean is " + mean + ".");
   System.out.println ("The standard deviation is " + stDev2 + ".");
   }
}