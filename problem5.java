import java.util.Scanner;

public class problem5 {

<<<<<<< HEAD
	private static int word1; // JA: This should be a String variable
	private static int word2; 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a word: ");
		word1 = input.nextInt(); // JA: Read it as a string input.nextLine()
		System.out.println("Give me a second word: ");
		word2 = input.nextInt(); // JA: Read it as a string input.nextLine()
		
		if (word1.charAt(0) > word2.charAt(0)) {
			System.out.println(word2 " , " word1);
		}else 
			System.out.println(word1 " , " word2);
		
		
=======
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	    System.out.print("Input the first number: ");
	    double a = in.nextDouble();
	    System.out.print("Input the second number: ");
	    double b = in.nextDouble();
	    System.out.print("Input the third number: ");
	    double c = in.nextDouble();
	    System.out.print("The average value is " + average(a, b, c));
>>>>>>> 90bd93175750dacb90084a1fbba02956206111d8
	}

	  public static double average(double a, double b, double c){
	        return (a + b + c) / 3;
	    }
}
