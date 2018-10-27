
public class MyLong {
	
	public long value;

	public MyLong (long value) {
		this.value = value;
	}

	public long getValue() {
		return value;
	}
	
	public boolean isEven() {
		if (value % 2 == 0) {
			return true; 
		}else 
			return false;
	}
	
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true; 
		}else 
			return false;
	}
	
	public boolean isPrime() {
		for (long i = 2; i < value; i++){
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(long x) {
		if (x % 2 == 0) {
			return true; 
		}else 
			return false;
	}
	
	public static boolean isOdd(long x) {
		if (x % 2 != 0) {
			return true; 
		}else 
			return false;
	}
	
	public static boolean isPrime(long x) {
		for (long i = 2; i < x; i++){
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyLong x) {
		if (x.getValue() % 2 == 0) {
			return true; 
		}else 
			return false;
	}
	
	public static boolean isOdd(MyLong x) {
		if (x.getValue() % 2 != 0) {
			return true; 
		}else 
			return false;
	}
	
	public static boolean isPrime(MyLong x) {
		for (long i = 2; i < x.getValue(); i++){
			if (x.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(long a) {
		if (value == a) {
			return true;
		}else 
			return false;
	}
	
	public boolean equals(MyLong a) {
		if (value == a.getValue()) {
			return true; 
		}else 
			return false;
	}
	
	public static long parseLong(char[] b){
		long num = 0;
		for (int i = 0; i < b.length; i++) {
			int n = b[i] - '0';
			num = num * 10;
			num = n + num;
		}
		return num;
		
	}
	
	public static long parseLong(String a) {
		long num = 0;
		for (int i = 0; i < a.length(); i++) {
			int n = a.charAt(i) - '0';
			num = num * 10; 
			num = n + num;
		}
		return num;
	}
	
	
	

	

}
