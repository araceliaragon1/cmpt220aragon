// Lab 4 - Problem 1 
public class MeasureConversion {

	public static void main(String[] args) {
		System.out.println("in        cm  |  cm        in");
		System.out.println("-----------------------------");
		
		for (int i = 1, j = 1; i <= 50; i++, j +=5) {
			System.out.printf("%2d%10.2f  |  %3d%10.2f\n", i, i*2.54, j, j*0.39);
		}
	}
}
