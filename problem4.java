import java.util.Scanner;

public class problem4 {
	
	private static int character1;
	private static int character2; 
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Give me a character: ");
		character1 = input.nextInt();
		System.out.println("Give me a second character: ");
		character2 = input.nextInt();
	
		for (char i = 0; i < character1.length(); i++)
		{
			char character1 = character1.char(i);
			int value = character1;
			System.out.println(value);
		}
		
		for (char i = 0; i < character2.length(); i++)
		{
			char character2 = character2.char(i);
			int value = character2;
			System.out.println(value);
		}
		
	}

}
