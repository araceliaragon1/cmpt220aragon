// Lab 4 - Problem 3 

import java.util.Scanner;

public class MyString {
	public static void main(String[] args) {
	String string, reverse = ""; 
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a string to check if it is a palindrome");
    string = input.nextLine();

    int length = string.length();

    for (int i = length - 1; i >= 0; i--) {
       reverse = reverse + string.charAt(i);
    }

    if (string.equals(reverse))
       System.out.println(string + " is a palindrome.");
    else
       System.out.println(string + " is not a palindrome.");
	   }

}

