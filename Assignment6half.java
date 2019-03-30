public class Assignment6half
{
	public static void main (String [] args)
	{
		// Creates variables
		String asterik = "*";
		String space = " ";
		int x;
		int y;
		int z;

		// Creates the pattern
		for ( x = 10; x > 0; x--  )
		{
			for ( z = 10-x; z > 0; z-- )
			{
				System.out.print( space );
			}
			for ( y = x; y >= 1; y-- )
			{
				System.out.print( asterik );
			}	
			System.out.println(); 
		}
	}
}