public class ReturningValuesDemo1
{
	public static void main( String [] args )
	{
		int x = 5;
		int y = 7;
		int z = addThem( x, y );
		
		System.out.println( "z = " + z );
	}
		
	public static int addThem( int x, int y )
	{
		int sum = x + y;
		return sum;
	}
}