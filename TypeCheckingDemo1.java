public class TypeCheckingDemo1
{
	public static void main( String [] args )
	{
		int i = 40;
		int j = 20;

		System.out.println( "result = " + divide ( i, j ) );
	}
	
	public static float divide( float x, float y )
	{
		return x / y;
	}
}