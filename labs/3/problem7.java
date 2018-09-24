// JA: Where is the method?
public class problem7 {

	public static void main(String[] args) {
		int count = 1;
		double number = 0;
		while (count <= 50) {
			double penNumber = (3*(number*number)-number)/2;
			
			number++;
			
			System.out.print(penNumber + " ");
			if (count % 10 == 0) {
				System.out.println(); // JA
			}
			
			count++;
			
		}
	}

}
