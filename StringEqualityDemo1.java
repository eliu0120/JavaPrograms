public class StringEqualityDemo1
{
	public static void main( String [] args )
	{
		String s1 = "Java programming";
		String s2 = "Java ";
		String s3 = "programming";
		String s4 = s2 + s3;

		System.out.println();
		System.out.println( "s1 is " + s1 );
		System.out.println( "s4 is " + s4 );

		if ( s1 == s4 )
			System.out.println( "s1 and s4 are equal" );
		else
			System.out.println( "s1 and s4 are not equal" );
	}
}