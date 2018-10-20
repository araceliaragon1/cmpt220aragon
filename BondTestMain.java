
public class BondTestMain {
	public static void main(String [] args) {
		Bond bond1 = new Bond(500, 100, 0.05, 10000);
		
		System.out.println("The price of bond 1 is: " + ((int)(bond1.getPrice() * 100))/ 100.0);
	}
}
