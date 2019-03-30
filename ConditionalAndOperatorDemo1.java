public class ConditionalAndOperatorDemo1
{
	public static void main( String [] args )
	{
		int age = 16;
		boolean isRegistered = true;

		System.out.println();
		
		if ( ( age >= 18 ) && isRegistered )
			System.out.println( "Outcome is true" );
		else
			System.out.println( "Outcome is false" );
	}
}