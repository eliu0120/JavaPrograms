public class StringBufferDemo
{
 public static void main( String [] args )
 {
 String s1 = "Groovy Baby";
 String s2 = "mini me?";
 String s3 = "Four score and seven years ago";
 String bc = "Buffer capacity = ";
 StringBuffer s = new StringBuffer("Where's ");
 // Display length of string & buffer
 System.out.println( "\n" + "String is " + s );
 System.out.println( bc + s.capacity() );
 System.out.println( "String length = " +
 s.length() );
 System.out.println();
 // Append string
 s.append( s2 );
 System.out.println( "String is " + s );
 System.out.println( bc + s.capacity() );
 System.out.println();
 // Trim string & insert characters
 s.setLength( 0 );
 s.append( s1 );
 System.out.println( "String is " + s );
 System.out.println( bc + s.capacity() );
 System.out.println();
 // Insert string

 s.insert( 11, s3 );
 System.out.println( "String is " + s );
 System.out.println( bc + s.capacity() );
 System.out.println();
 // Trim string, delete & add
 s.setLength( 0 );
 s.append( s3 );
 System.out.println( "String is " + s );
 s.deleteCharAt( 15 );
 System.out.println( "String is " + s );
 s.insert( 15, "el" );
 System.out.println( "String is " + s );
 s.delete( 15,16 ); // Delete 'e' in 'eleven'
 s.setCharAt( 15,'s' );
 System.out.println( "String is " + s );
 }
} 