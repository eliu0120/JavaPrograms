public class SwitchDemo1
{
	public static void main( String [] args )
	{
		int test_number = 3;
		System.out.println();
		switch ( test_number )
		{
			case 1:
				System.out.println( "The number is 1" );
				break;
			case 2:
				System.out.println( "The number is 2" );
				break;
			case 3:
				System.out.println( "The number is 3" );
				break;
			default:
				System.out.println( "It's not 1,2,3 or 4" );
				break;
		}
		System.out.println( "All Done!!" );
	}
}