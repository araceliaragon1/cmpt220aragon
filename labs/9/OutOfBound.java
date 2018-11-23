import java.util.Scanner;

public class OutOfBound {

	public static void main(String[] args) {
	
		int[] array = null;
		
		array = new int[100];
		Scanner input = new Scanner(System.in);
		System.out.println("Give me an index: ");
		int index = input.nextInt();
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		if (index >= array.length) {
			System.out.println("Out Of Bounds");
		}else {
			System.out.println(array[index]);
		}

		
	input.close();
	}
	
	
}
