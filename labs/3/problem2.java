public class problem2 {

	public static void main(String[] args) {
		int n = 0;
		int counter = 0; // JA: You should start this at 1
		for (int n1 = 100; n1 <= 500; n1++) { // JA
			if (n1 % 5 == 0 || n1 % 7 == 0) {
				if (counter % 10 == 0) {
					System.out.println( n1 + " ");
				}else {
					System.out.print(n1 + " ");
				}
				
				counter++;
			}
		}

	}
}
