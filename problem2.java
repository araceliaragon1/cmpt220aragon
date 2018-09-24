public class problem2 {

	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a month: ");
		// JA: It was the other way around int -> String.
		// You have to read the input.
		
		if (input == january) {
			System.out.println("1");
		}
		if (input == february) {
			System.out.println("2");
		}
		if (input == march) {
			System.out.println("3");
		}
		if (input == april) {
			System.out.println("4");
		}
		if (input == may) {
			System.out.println("5");
		}
		if (input == june) {
			System.out.println("6");
		}
		if (input == july) {
			System.out.println("7");
=======
		int n = 0;
		int counter = 0;
		for (int n1 = 100; n1 < 500; n1++) {
			if (n1 % 5 == 0 || n1 % 7 == 0) {
				if (counter % 10 == 0) {
					System.out.println( n1 + " ");
				}else {
					System.out.print(n1 + " ");
				}
				
				counter++;
			}
>>>>>>> 90bd93175750dacb90084a1fbba02956206111d8
		}

	}
}
