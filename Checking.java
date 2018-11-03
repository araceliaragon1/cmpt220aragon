
public class Checking extends Account {
	public double overdraftLimit = -100;
	
	public Checking() {
		super();
		
	}
	public Checking(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	} 
	
	public void withdraw(double take) {
		if (getBalance() - take > overdraftLimit) {
			super.withdraw(take);
		}else {
			System.out.println("Insufficient Amount");
		}
	}
	public String toString() {
		return "Account ID " + getId() + " Account Balance " + getBalance() + " Account Overdraft Limit " + overdraftLimit;
	}
	
}
