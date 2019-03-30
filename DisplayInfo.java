public class DisplayInfo
{
	public static void main( String [] args )
	{
		int studentInfo[][] = { {1, 78, 85}, {2, 83, 90} };

		for( int j = 0; j < studentInfo.length; j++ )
		{
			System.out.println();

			for( int k = 0; k < studentInfo[j].length; k++ )
				System.out.print( studentInfo[j][k] + "\t" );
		}

		System.out.println();
	}
}