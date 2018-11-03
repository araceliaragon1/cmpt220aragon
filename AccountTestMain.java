
public class AccountTestMain {

	public static void main(String[] args) {
		Account account1 = new Account(1, 1000);
		
		Saving saving1 = new Saving(12, 1000);
		
		Checking checking1 = new Checking(123, 1000, -100);
		
		System.out.println(account1);
		System.out.println(saving1);
		System.out.println(checking1);
	}

}
