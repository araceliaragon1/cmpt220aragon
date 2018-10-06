// Lab 5 - Problem 6

import java.util.Scanner;
public class MatrixAverage{
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for rows: ");
        int rows = input.nextInt();

        System.out.print("Enter a number for columns: ");
        int columns = input.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the numbers in array: ");

        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<columns ; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0  ; j<columns ; j++)
            {
                System.out.print(array[i][j] + " , ");
            }
            System.out.println("\n");    
        }  
    }
    double averageRow(int[][] array) {
        int rowTotal = 0;
        double average = 0;

        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                rowTotal += array[rows][columns];
            }
            average = rowTotal / array[rows].length;
            System.out.println(average);
            rowTotal = 0;
        }
        return rowTotal;    
    }
    double averageColumn(int[][] array) {
        int columnTotal = 0;
        double average = 0;

        for (int columns = 0; columns < array.length; columns++) {
            for (int rows = 0; rows < array[columns].length; rows++) {
                columnTotal += array[rows][columns];
            }
            average = columnTotal / array[columns].length;
            System.out.println(average);
            columnTotal = 0;
        }
        return columnTotal;  
    }
}
