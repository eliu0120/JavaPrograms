import java.util.Scanner;
public class ScannerDemo1
{
	public static void main( String [] args )
	{
		// Create a Scanner object
		Scanner input = new Scanner( System.in );
		
		// Prompt the user to enter data
		System.out.print( "Please enter an integer value: ");

		// Read the value entered
		int data = input.nextInt();

		// Display the value entered
		System.out.println( "You entered " +data );
	}
}