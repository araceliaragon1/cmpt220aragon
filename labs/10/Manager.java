
public class Manager extends Employee {

	
	public Manager(String name, double age, double hourRate) {
		this.name = name;
		this.age = age;
		this.hourRate = hourRate;
	}

		@Override
	public double salary(double hours) {
		double salary = hours * hourRate;
		return salary;
	}
	
}
