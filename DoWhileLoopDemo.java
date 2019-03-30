public class DoWhileLoopDemo
{
	public static void main( String [] args )
	{
		int i = 1;
		int j;
	
		System.out.println();

		do
		{
			j = 2 * i;
			System.out.println( "i = " + i + " j = " + j );
			i = i + 1;
		} while ( i <= 5 );

		System.out.println();
		System.out.println( "All Done!" );
	}
}