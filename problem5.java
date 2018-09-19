import java.util.Scanner;

public class problem5 {

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
		
		
	}

}
