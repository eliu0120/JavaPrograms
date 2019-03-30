public class TestDemos9
{
     public static void main( String [] args )
     {
          String s1 = new String( "Welcome to Java" );
          String s2 = new String( "Welcome to Java");

          if( s1.equals( s2 ) )
               System.out.println( "s1 and s2 have the same contents" );
          else
               System.out.println( "s1 and s2 have different contents" );
     }
}