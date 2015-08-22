
/**
 * This program will accept values for a matrix(into an array) and will call the matrix multiplier to multiply them
 * 
 * @author Rigo Torres
 * @version 4/17/2015
 */
import java.util.Scanner;
//import java.util.Arrays
public class Driver
{
    public static void main(String []args)
    {
        int [][]array1;
        int [][]array2;
        int rows;
        int columns;
        //int[] array2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("For the first array, enter the number of rows you would like it to have: ");
        rows = input.nextInt();
        
        System.out.print("How many columns would you like?");
        columns = input.nextInt();
        
        array1 = new int[rows][columns];
        
        for(int i = 0; i < rows; i++)
        {
            for(int x = 0; x < columns; x++)
            {
                System.out.print("\nPlease enter the number for Row " + i + " , Column " + x + ". :");
                array1[i][x] = input.nextInt();
            }
        }
        
        ArrObj arO1 = new ArrObj(array1);
        
        for(int i = 0; i < arO1.getRows(); i++)
        {
            for(int x = 0; x < arO1.getColumns(); x++)
            {
               System.out.print(array1[i][x] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\nFor the second array, how many rows would you like?: ");
        rows = input.nextInt();
        
        System.out.println("How many columns would you like?: ");
        columns = input.nextInt();
        
        array2 = new int[rows][columns];
        
        for(int i = 0; i < rows; i++)
        {
            for(int x = 0; x < columns; x++)
            {
                System.out.print("\nPlease enter the number for Row " + i + " , Column " + x + ". :");
                array2[i][x] = input.nextInt();
            }
        }
        
        ArrObj arO2 = new ArrObj(array2);
        
        for(int i = 0; i < arO2.getRows(); i++)
        {
            for(int x = 0; x < arO2.getColumns(); x++)
            {
               System.out.print(array2[i][x] + " ");
            }
            System.out.print("\n");
        }
       
        System.out.println("\n\nOk, now we will multiply the first matrix by the second");
        
        ArrObj prod = (arO1.multiply(arO2));
        
        System.out.println("This is the result!: \n");
        
        System.out.println(prod.toString());
        
        /*
        for(int i = 0; i < prod.getRows(); i++)
        {
            for(int x = 0; x < prod.getColumns(); x++)
            {
               System.out.print(array1[i][x] + " ");
            }
            System.out.print("\n");
        }
        */
        
        
    }
}
