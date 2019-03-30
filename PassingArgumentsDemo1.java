public class PassingArgumentsDemo1
{
	public static void main ( String [] args )
	{
		displayArgs ( 10, 20F );
	}
	
	public static void displayArgs (  int x, float y )
	{
		System.out.println( "First arg is " + x );
		System.out.println( "Second arg is " + y );
	}
}