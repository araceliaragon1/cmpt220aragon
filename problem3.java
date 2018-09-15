import java.util.Scanner;

public class problem3 {

	private static int lower1;
	private static int higher1;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a low number: ");
		lower1 = input.nextInt();
		System.out.println("Give me a high number: ");
		higher1 = input.nextInt();
		int min = lower1;
		int max = higher1;
		double random = (int) min + (max - min) * Math.random();
		
		if (lower1 < higher1)
		for (int i=0; i<3; i++) {
			System.out.println(random);
		}
	}

}
