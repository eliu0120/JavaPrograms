public class TestAnswers5
{
	public static void main ( String [] args )
	{
boolean birthday = true;
int age = 64;   

if( birthday == true && age++ != 65 )
     System.out.println( age );
else
     System.out.println( ++age );
	}
}