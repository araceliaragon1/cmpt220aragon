
public class problem3 {

	public static void main(String[] args) {
		char n = 0;
		int counter = 0;
		for (char n1 = 0; n1 < 100; n1++) {
				if (counter % 20 == 0) {
					System.out.println( n1 + " ");
				}else {
					System.out.print(n1 + " ");
				}
				
				counter++;
		}
		
	}

}
