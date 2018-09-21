
public class problem4 {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int number = 0;
        for(a = 0; a <= 15000; a++)
        {
            for( b = 2; b < a; b++)
            {
                if(a % b == 0)
                {
                    number = 0;
                    break;
                }
                else
                {
                    number = 1;
                }
            }
            if(number == 1)
            {
                System.out.println(a);
            }
        }
   }
}