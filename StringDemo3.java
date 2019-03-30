public class StringDemo3
{
	public static void main ( String [] args )
	{
		String s1 = new String( "Java rocks!!" );

		System.out.println();
	
		for ( int j = 0; j < 4; j++ )
			System.out.print( s1.charAt( j ) );

		System.out.println();
	}
}