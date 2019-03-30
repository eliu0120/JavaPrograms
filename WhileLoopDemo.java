public class WhileLoopDemo
{
	public static void main( String [] args )
	{
		int i = 1;
		int j;

		System.out.println();

		while ( i <= 5 )
		{
			j = 2 * i;
			System.out.println( "i = " + i + " j = " + j );
			i++;
		}
		
		System.out.println();
		System.out.println( "All Done!" );
	}
}