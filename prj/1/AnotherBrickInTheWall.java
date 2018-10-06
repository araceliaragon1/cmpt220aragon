import java.util.Scanner;

public class AnotherBrickInTheWall {

	public static void main(String[] args) {
	int h, w, n;
	int l;
	Scanner input = new Scanner(System.in);
	System.out.println("Give me a height, a width and the number of bricks: ");
	h = input.nextInt();
	w = input.nextInt();
	l = w;
	n = input.nextInt();
	System.out.println("Give me bricks: ");
	int[] myBricks;
	myBricks = new int[n];
	for (int i = 0; i < n; i++) {
		myBricks[i] = input.nextInt();
	//	System.out.println(myBricks[i]);
	}
	if (h >= 1 && h<= 100) {
		if (w >= 1 && w <= 100) {
			if (n >= 1 && n <= 10000) {
			//	System.out.println("");
			}
		}
	}else {
		System.out.println("2");
	}
	for (int i = 0; i < n; i++) {
		if (myBricks[i] <= l) {
			l = l - myBricks[i];
		}else {
			break;
		}
		if (l == 0) {
			h = h - 1;
			l = w;
		}
		if (h == 0) {
			l = 0;
			break;
		} 
	}
	if (l == 0 && h == 0) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
	
				
	}

}
