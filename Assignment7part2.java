public class Assignment7part2
{
	public static void main( String [] args )
	{
		/* Creates variables for prompt */
		double L = 0;
		double N = 0;
		double i = 0;

		/* Prompts user to input data for variables */
		L = Input.getDouble( "Please enter the loan" );
		N = Input.getDouble( "Please enter the length of term in years" );
		i = Input.getDouble( "Please enter annual interest rate in %" );

		/* Converts the returned variables into different variables to be used in the text */
		double pay = Monthly_payment( L, N, i );

		/* Formats the variable's text */
		java.text.DecimalFormat df = new java.text.DecimalFormat( "#####.##" ); 

		/* Displays the monthly payment */
		System.out.println( "\nThe monthly payment is " + df.format( pay ) );
	}

	/* Performs the calculations */
	public static double Monthly_payment( double L, double N, double i )
	{
		double I = i / 100;
		double r = I / 12;
		double n = 12 * N;
		double P = ( ( r * L ) / ( 1 - Math.pow ( 1 + r, -n ) ) );
		
		return P;
	}
}