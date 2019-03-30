public class ForLoopDemo1
{
	public static void main ( String [] args )
	{
		int i;
		int j;

		System.out.println();
		
		for ( i = 1 ; i <= 5 ; i = i + 1 )
		{
			j = 2 * i;
			System.out.println ( "i = " + i + " j = " + j );
		}
		
		System.out.println();
		System.out.println( "All Done!" );
	}
}