import java.util.ArrayList;
import java.util.Scanner;

public class SortList {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Give me five numbers: ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		System.out.println(list);
		sort(list);
		System.out.println(list);
		
		input.close();
	}
	
	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int smallest = i;
			for (int k = i + 1; k < list.size(); k++) {
				if (list.get(smallest) > list.get(k)) {
					smallest = k;
				}
			}
			int temp = list.get(i);
			list.set(i,list.get(smallest));
			list.set(smallest, temp);
		}
		// list[4] ==> array
		// list.get(4) ==> array list
		// list[4] = 2 ==> array
		// list.set(4,2) ==> array list
		// list.length ==> array
		//list.size() ==> array list
	}
	
}
