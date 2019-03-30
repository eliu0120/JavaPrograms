public class ReturnArrayDemo1
{
	public static void main( String [] args )
	{
		int a[] = returnArray();
		System.out.println();
		display( a );
	}
	
	public static int[] returnArray()
	{
		int m[] = { 99, 99, 99, };
		return m;
	}

	public static void display( int array[] )
	{
		for( int j = 0; j < array.length; j++ )
			System.out.println( array [j] );
	}
}