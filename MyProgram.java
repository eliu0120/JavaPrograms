public class MyProgram
{
     public static class MyStuff
     {
          private int x;
          private int y;

          public MyStuff( int a, int b ) { x = a; y = b; }
          public int getX() { return x; }
          public int getY() { return y; }
          public void setData( int a, int b ) { x = a; y = b; }

     }
     public static void main( String [] args )
     {
          MyStuff obj = new MyStuff( 30, 20 );
          swap( obj );
          System.out.println( obj.getX() + " " + obj.getY() );
     }

     public static void swap( MyStuff o )
     {
          int a = o.getX();
          int b = o.getY();

          if( a > b )
          {
               int temp = b;
               b = a;
               a = temp;
               o.setData( a, b );
          }
     }

}