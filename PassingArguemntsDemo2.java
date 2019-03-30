public class PassingArguemntsDemo2
{
	public static void main( String [] args )
	{
		int x = 5;

		System.out.println();
		changeValue( x );
		
		System.out.println( "x = " + x );
	}
	public static void changeValue( int x )
	{
		System.out.println( "Value passed = " + x );
		x = 99;
	}
}