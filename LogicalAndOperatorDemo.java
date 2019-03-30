public class LogicalAndOperatorDemo
{
	public static void main( String [] args )
	{
		int x = 10;
		int testCount = 0;

		System.out.println();

		if ( ( x < 10 ) & ( ++testCount >= 0 ) )
			System.out.println( "True : testCount = " + testCount );
		else
			System.out.println( "False: testCount = " + testCount );
	}
}