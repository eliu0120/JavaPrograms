public class ConditionalOrOperatorDemo1
{
	public static void main( String [] args )
	{
		byte age = 64;
		boolean frequentBuyerMember = false;

		if ( age > 65 || frequentBuyerMember )
			System.out.println( "You get a discount" );
		else
			System.out.println( "Sorry...no discount" );
	}
}