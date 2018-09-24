
// JA: This does not solve the problem
public class problem4 {
	
	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner input = new Scanner (System.in);
		System.out.println("Give me a character: ");
		character1 = input.nextInt(); 
		System.out.println("Give me a second character: ");
		character2 = input.nextInt();
	
		for (char i = 0; i < character1.length(); i++)
		{
			char character1 = character1.char(i);
			int value = character1;
			System.out.println(value);
		}
		
		for (char i = 0; i < character2.length(); i++)
		{
			char character2 = character2.char(i);
			int value = character2;
			System.out.println(value);
		}
		
	}

}
=======
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
>>>>>>> 90bd93175750dacb90084a1fbba02956206111d8
