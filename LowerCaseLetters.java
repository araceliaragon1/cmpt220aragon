// Lab 4 - Problem 2  

public class LowerCaseLetters {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((char)((int)(Math.random()*26)+ 'a') + " ");
			}
			System.out.println();
		}
	}

}
