import java.util.Scanner;
public class JavaAssignment4
{
	public static void main( String [] args )
	{
		// Create a Scanner object
		Scanner input = new Scanner( System.in );

		// Prompt the user to enter data
		System.out.print( "\nEnter a value for the first test score: " );
		
		// Read the value entered
		float data1 = input.nextInt();

		// Prompt the user to enter data
		System.out.print( "\nEnter a value for the first test score: " );
		
		// Read the value entered
		float data2 = input.nextInt();

		// Prompt the user to enter data
		System.out.print( "\nEnter a value for the first test score: " );
		
		// Read the value entered
		float data3 = input.nextInt();

		// Define multiple variables
		float x = 3F;
		float y;

		// Calculates average
		y = (data1 + data2 + data3) / x;

		// Determines grade and displays average score and grade
		if ( y >= 97.5 )
		{
			System.out.println( "\n" + "Average is " + y + " Grade is A+." );
		}
		else if ( y >= 93.5 )
		{
			System.out.println( "\n" + "Average is " + y + " Grade is A." );
		}
		else if ( y >= 89.5 )
		{
			System.out.println( "\n" + "Average is " + y + " Grade is A-." );
		}
		else if ( y >= 86.5 )
		{
			System.out.println( "\n" + "Average is " + y + " Grade is B+." );
		}
		else if ( y >= 82.5 )
		{
			System.out.println( "\n" + "Average is " + y + " Grade is B." );
		}
		else if ( y >= 79.5 )
		{
			System.out.println( "\n" + "Average is " + y + " Grade is B-." );
		}
		else if ( y >= 69.5 )
		{
			System.out.println( "\n" + "Average is " + y + " Grade is C." );
		}
		else
		{
			System.out.println( "\n" + "Average is " + y + " Grade is F." );
		}
	}
}