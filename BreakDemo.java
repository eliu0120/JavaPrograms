public class BreakDemo
{
	public static void main( String [] args )
	{
		int j = 0;
		int sum = 0;

		System.out.println();
	
		for ( j = 1; j <= 10; j++ )
		{
			if ( j == 5 )
				break;
			sum += j;
		}
		
		System.out.println( "Broke out of loop when j = " + j );
	}
}
