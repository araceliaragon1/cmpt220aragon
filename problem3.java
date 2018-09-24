
public class problem3 {

	public static void main(String[] args) {
<<<<<<< HEAD
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
			System.out.println(random); // JA: This does not recalculate. You have to 
										// include the calculation line in the loop
=======
		char n = 0;
		int counter = 0;
		for (char n1 = 0; n1 < 100; n1++) {
				if (counter % 20 == 0) {
					System.out.println( n1 + " ");
				}else {
					System.out.print(n1 + " ");
				}
				
				counter++;
>>>>>>> 90bd93175750dacb90084a1fbba02956206111d8
		}
		
	}

}
