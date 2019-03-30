public class TestPractice4
{
   public static void main( String [] args )
   {
      final int c1 = 1;
      final int c2 = 2;
      int x = 1;

      switch ( x )
      {
         case c1: x = 1;
         case c2: x = 2;
         case 3:   x = 3;
         default:   x = 2 * x;
      }

      System.out.println( x );
   }
}