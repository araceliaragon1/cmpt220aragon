<<<<<<< HEAD
// JA: You are missing the check for the phone number not starting with 0 or 1
=======
import java.util.Scanner;

>>>>>>> 90bd93175750dacb90084a1fbba02956206111d8
public class problem6 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give me a phrase: ");
        String str = in.nextLine();

        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
    }
 public static int count_Vowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
            	
                count++;
                
            }
        }
        
        return count;
        
}
 
}
