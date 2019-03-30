public class ArrayPassingDemo1
{
	public static void main( String [] args )
	{
		int array[] = { 10, 20, 30 };

		changeArray ( array );

		System.out.println();

		for ( int j = 0; j < 3; j++ )
			System.out.println( array[j] );

	}

	public static void changeArray( int a[] )
	{
		a[1] = 99;
	}
}