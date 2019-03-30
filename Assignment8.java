public class Assignment8
{
/* Main method for generation and display of numbers */
	public static void main( String [] args )
	{
		/* Declares necessary variables */
		int x = 0;
		int y;
		int a[] = new int[100];

		/* Generates 100 random numbers */
		for ( y = 0; y < 100; y++ )
		{
			a[y] = ( int )( Math.random() * 100 + 1 );
		}

		/* Displays the multiples of four */
		System.out.println( "Multiples of four: ");
		int c[] = Multiples_of_Four( a );
		for ( int i = 0; i < c.length; i++ )
		{
			if ( c[i] > 0 )
			{
				System.out.println( c[i] );
			}
		}

		/* Displays the not multiples of four */
		System.out.println( "\nNot multiples of four: ");
		int d[] = Not_Multiples_of_Four( a );
		for ( int e = 0; e < d.length; e++ )
		{
			if ( d[e] > 0 )
			{
				System.out.println( d[e] );
			}
		}
	}

	/* Method for sorting the multiples of four */
	public static int[] Multiples_of_Four( int []a )
	{
		/* Declares necessary variables */
		int length = a.length;
		int b[] = new int[length];
		int k = 0;

		/* Sorts numbers in arrays into separate array */
		for ( int i = 0; i < a.length; i++ )
		{
			if ( a[i] % 4 == 0 )
			{
				b[k++] = a[i];
			}
		}
		
		/* Returns modified array */
		return b;
	}

	/* Method for sorting the not multiples of four */
	public static int[] Not_Multiples_of_Four( int []a )
	{
		/* Declares necessary variables */
		int length = a.length;
		int b[] = new int[length];
		int k = 0;
		
		/* Sorts numbers in arrays into separate array */
		for ( int i = 0; i < a.length; i++ )
		{
			if ( a[i] % 4 > 0 )
			{
				b[k++] = a[i];
			}
		}

		/* Returns modified array */
		return b;
	}
}