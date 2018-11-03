
public class Saving extends Account {
	
	public Saving() {
		super();
		
	}
	public Saving(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double take) {
		if (take > getBalance()) {
			System.out.println("Insufficient Amount");
		}else {
			super.withdraw(take);
		}
	}
	
	public String toString() {
		return "Account ID " + getId() + " Account Balance " + getBalance();
	}
}
