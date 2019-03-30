public class IncrementDemo
{
	public static void main( String [] args )
	{
		int x = 10;
		int y = 0;
		
		y = x++; // y is now 10, x is now 11
		
		System.out.println( "\n" + x + "\t" + y );

		y = ++x; // y is now 12, x is now 12

		System.out.println( x + "\t" + y );
	}
}