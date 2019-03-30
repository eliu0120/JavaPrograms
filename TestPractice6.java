public class TestPractice6
{
	public static void main (String [] args)
	{
for( int i = 1; i < 10; i++ )
{
     if( i % 2 == 0 )
          continue;
     for( int j = 0; j < 3; j++ )
          System.out.print( j + " " );
}
	}
}