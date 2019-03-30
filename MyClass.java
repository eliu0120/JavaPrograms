public class MyClass
{
     private int x;
     private int y;

     public MyClass()
     {
          x = 0;
          y = 0;
     }
     public int getX() { return x; }
     public int getY() { return y; }
     public void writeData() { System.out.println( getX() + " " + getY()); }
}