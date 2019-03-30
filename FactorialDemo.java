public class FactorialDemo
{
	public static void main( String [] args )
	{
		int factorial = 1;
		
		System.out.println();
	
		for ( int n = 1; n <= 5; n++ )
		{
			factorial = n;
			for ( int j = n - 1; j >= 1; j--)
			{
				factorial *= j;
			}
			
			System.out.println( "n = " + n + "\t n! = " + factorial );
		}
	}
}