
public class Bond {
	public double coupon;
	public int payments;
	public double interest;
	public double valueMaturity;
	
	public Bond() {
		coupon = 100;
		payments = 6;
		interest = 0.04;
		valueMaturity = 110;
	}
	
	public Bond(double coupon, int payments, double interest, double valueMaturity) {
		this.coupon = coupon;
		this.payments = payments;
		this.interest = interest;
		this.valueMaturity = valueMaturity; 
	}
	
	public double getPrice() {
		double price = coupon * (1 - (1/Math.pow(1 + interest, payments))) + valueMaturity * 1/Math.pow(1 + interest, payments);
		return price;
	}
	
}
