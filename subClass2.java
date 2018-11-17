
public class subClass2 extends AbstractClass{
	public static void main(String[] args) {
		subClass2 object = new subClass2();
		object.printMessage();
	}

	@Override
	String printMessage() {
		System.out.println("This the second subclass.");
		return null;
	}

}
