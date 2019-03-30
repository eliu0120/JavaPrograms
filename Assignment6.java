import java.util.Scanner;
public class Assignment6
{
	public static void main (String [] args)
	{
		// States function of program
		System.out.println("\nThis program calculates the sum of the integers in a range that are divisible by 3");

		// Create a Scanner object
		Scanner input = new Scanner( System.in );

		// Prompt the user to enter data
		System.out.print( "\nEnter an upper bound for the range: " );

		// Read the value entered
		int data = input.nextInt();

		// Creates variables
		int i = 1;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;

		// Creates while loop that determines number of integers divisible by 3
		while ( i <= data )
		{
			if ( i % 3 == 0 )
			{
				j++;
				l += i;
			}
			else
			{
				k++;
				m += i;	
			}
		i++;
		}
		
		// States the number of integers divisible and not divisible by 3
		System.out.println( "\n" + j + " numbers in the range 1 - " + data + " are divisible by 3 & their sum is " + l );
		System.out.println( k + " numbers in the range 1 - " + data + " are not divisible by 3 & their sum is " + m );
	}
}
