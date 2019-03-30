public class ContinueDemo
{
	public static void main( String [] args )
	{
		int j = 0;
		int sum = 0;
	
		System.out.println();

		for ( j = 1; j <= 10; j++ )
		{
			if ( j == 5 )
				continue;
			sum += j;
			System.out.println( "j = " + j + " sum = " + sum );
		}
	}
}