import java.util.Scanner;
public class JavaAssignment5
{
	public static void main ( String [] args )
	{
		// Create Scanner objects
		Scanner input = new Scanner ( System.in);

		// Prompt the user to enter data
		System.out.print( "\nPlease enter a package weight in pounds: ");

		// Read the value entered
		float data = input.nextFloat();

		// Display shipping cost
		if ( data <= 0 )
		{
			System.out.println( "\nThe weight must be greater than zero" );
		}
		else if ( ( data > 0 ) & ( data <= 1 ) )
		{
			System.out.println( "\nThe shipping cost is $2.95" );
		}
		else if ( ( data > 1 ) & ( data <= 3 ) )
		{
			System.out.println( "\nThe shipping cost is $4.95" );
		}
		else if ( ( data > 3 ) & ( data <= 10 ) )
		{
			System.out.println( "\nThe shipping cost is $9.45" );
		}
		else if ( ( data > 10 ) & ( data <= 20 ) )
		{
			System.out.println( "\nThe shipping cost is $12.50" );
		}
		else
		{
			System.out.println( "\nThe package is too heavy to be shipped" );
		}
	}
}