
public class subClass1 extends AbstractClass{

	public static void main(String[] args) {
		subClass1 object = new subClass1();
		object.printMessage();
	}

	@Override
	String printMessage() {
		System.out.println("This the first subclass.");
		return null;
	}

}
