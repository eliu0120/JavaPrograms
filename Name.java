public class Name
{
	private String nameAttribute;

	public Name()
	{

	}

	public Name ( String y )
	{
		this.nameAttribute = y;
	}

	public String getName()
	{
		return this.nameAttribute;
	}

	public String toString()
	{
		return this.nameAttribute;
	}

	public void setName( String x )
	{
		this.nameAttribute = x;
	}
}