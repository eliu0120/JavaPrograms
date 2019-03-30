import java.util.Scanner;
public class Assignment9
{
	public static void main( String [] args )
	{
		// Asks for user input
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter a sentence: " );
		String data = input.nextLine();
		System.out.print( "\nEnter 1 to count characters, 2 to count words: "); 
		int counter = input.nextInt();
		int x = data.length();

		// Determines the number of characters in a string
		if ( counter == 1 )
		{
			System.out.println( "There are " + x + " characters in this sentence." );
		}

		// Determines the number of words in a string
		else if ( counter == 2 )
		{
    			int count = data.replaceAll( "[a-zA-Z0-9[^\\w\\s-_]]", "" ).length();

			if ( data.replaceAll( "\\s+", "" ).length() > 1 )
			{
				count++;
			}

    			System.out.println("There are " + count + " words in this sentence.");
		}		
	}

}
			
