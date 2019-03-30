public class IfElseDemo1
{
	public static void main( String [] args )
	{
		int passingGrade = 70;
		int testScore = 65;
		
		System.out.println( "\n" + "Your test score is " + testScore );
		
		if ( testScore >= passingGrade)
		{
			System.out.println( "You passed the test." );
		}
		else
		{
			System.out.println( "You didn't pass." );
		}
	System.out.println();
	System.out.println ( "All Done!" );
	}
}