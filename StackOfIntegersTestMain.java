import java.util.Scanner;

public class StackOfIntegersTestMain {
	
	public static void main(String[] args) {
		StackOfIntegers stack1 = new StackOfIntegers();
		StackOfIntegers stack2 = new StackOfIntegers();
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a positive integer: ");
		int num = input.nextInt();
		for(int i = num; i > 1; i--) {
			// isPrime(i);
			if (isPrime(i) == true) {
				if (num % i == 0) {
					stack1.push(i);
					num = num / i; 
					i = i + 1;
					//System.out.println(i);
				}
			}
		}
		//System.out.println(stack1.peek());
		while(stack1.empty() != true) {
			//System.out.println(stack1.peek());
			stack2.push(stack1.peek());
			stack1.pop();
			//System.out.println(stack2.peek());
		}
		while (stack2.empty() != true) {
			System.out.println(stack2.peek());
			stack2.pop();
		}
	}
	
	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++){
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}




