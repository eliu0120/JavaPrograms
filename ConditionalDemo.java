public class ConditionalDemo
{
	public static void main( String [] args )
	{
		int x = 10;
		int y = 20;
		int z;

		System.out.println();
		
		z = ( x < y ) ? ( 3 * x ) : ( 2 + y );
		System.out.println( " z = " + z );
	}
}