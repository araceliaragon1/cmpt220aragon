
public class MyLongTestMain {

	public static void main(String[] args) {
		MyLong num = new MyLong(93858); 
		// value 
		System.out.println("Is the number even? " + num.isEven());
		System.out.println("Is the number odd? " + num.isOdd());
		System.out.println("Is the number prime? " + num.isPrime());
		// long 
		System.out.println();
		System.out.println("Is the number even? " + MyLong.isEven(753073432234323L));
		System.out.println("Is the number odd? " + MyLong.isOdd(753073432234323L));
		System.out.println("Is the number prime? " + MyLong.isPrime(753073432234323L));
		// MyLong
		System.out.println();
		System.out.println("Is the number even? " + MyLong.isEven(num));
		System.out.println("Is the number odd? " + MyLong.isOdd(num));
		System.out.println("Is the number prime? " + MyLong.isPrime(num));
	}

}
