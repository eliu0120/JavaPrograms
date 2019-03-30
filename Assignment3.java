import java.util.Scanner;
public class Assignment3
{
	public static void main( String [] args )
	{
		// Create a Scanner object
		Scanner input = new Scanner( System.in );

		// Prompt the user to input temperature in degrees Farenheit
		System.out.print( "\n" + "Enter a temperature in degrees Farenheit: ");

		// Read the value entered
		double data = input.nextDouble();

		// Reads values for variables used in calculations
		short x = 32;
		float y = 1.8f;
		short z = 273;
		double q;

		// Calculates Kelvin temperature
		q = ((data - x) / y) + z;
		
		// Display the value entered
		System.out.println( "\n" + "Kelvin temperature = " + q );
	}
}
