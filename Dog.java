// Object class
public class Dog
{
	// Determines name
	public String determineName()
	{
		int name = ( int )( Math.random() * 5 );

		if ( name == 0 )
		{
			String n = "Andy";
			return n;
		}
		else if ( name == 1 )
		{
			String n = "Sasha";
			return n;
		}
		else if ( name == 2 )
		{
			String n = "Jess";
			return n;
		}
		else if ( name == 3 )
		{
			String n = "Jake";
			return n;
		}
		else
		{
			String n = "Will";
			return n;
		}
	}

	// Determines gender
	public String determineGender()
	{
		int gender = ( int )( Math.random() * 2 );

		if ( gender == 0 )
		{
			String g = "Male";
			return g;
		}
		else
		{
			String g = "Female";
			return g;
		}

	}

	// Determines Breed
	public String determineBreed()
	{
		int breed = ( int )( Math.random() * 3 );

		if ( breed == 0 )
		{
			String b = "Golden Retriever";
			return b;
		}
		else if ( breed == 1 )
		{
			String b = "Husky";
			return b;
		}
		else
		{
			String b = "Unknown breed";
			return b;
		}
	}

	// Determines age
	public int determineAge()
	{
		int age = ( int )( Math.random() * 354 );
		return age;
	}

	// Determines Weight
	public int determineWeight()
	{
		int weight = ( int )( Math.random() * 344 );
		return weight;
	}

	// Determines fleas
	public int determineNumber()
	{
		int fleas = ( int )( Math.random() * 2 );

		return fleas;
	}
	public String determineFleas()
	{
		int fleas = determineNumber();

		if ( fleas == 0 )
		{
			String f = "has fleas";
			return f;
		}
		else
		{
			String f = "has no fleas";
			return f;
		}	
	}

	// Determines behavior
	public String determineBehavior()
	{
		int f = determineNumber();

		if ( f == 0 )
		{
			int behavior = ( int )( Math.random() * 3 );

			if ( behavior == 0 )
			{
				String b = "chomp chomp";
				return b;
			}
			else if ( behavior == 1 )
			{
				String b = "woof woof woof";
				return b;
			}
			else
			{
				String b = "scratch scartch";
				return b;
			}
		}
		else
		{
			int behavior = ( int )( Math.random() * 2 );

			if ( behavior == 0 )
			{
				String b = "chomp chomp";
				return b;
			}
			else
			{
				String b = "woof woof woof";
				return b;
			}
		}
	}
}