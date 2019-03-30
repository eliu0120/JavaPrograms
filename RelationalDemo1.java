public class RelationalDemo1
{
	public static void main( String [] args )
	{
		int x = 10;
		int y = 20;
		boolean b = true;

		b = ( x == y );
		System.out.println( " b = " + b );

		b = ( x < y );
		System.out.println( " b = " + b );

		b = ( ( 2 * x ) == y );
		System.out.println( " b = " + b );
	}
}