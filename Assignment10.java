// main class
public class Assignment10
{
	public static void main( String [] args )
	{
		// Creates objects of first dog
		Dog name1 = new Dog();
		Dog gender1 = new Dog();
		Dog breed1 = new Dog();
		Dog age1 = new Dog();
		Dog weight1 = new Dog();
		Dog fleas1 = new Dog();
		Dog behavior1 = new Dog();

		// Determines the attributes of first dog
		name1.determineName();
		gender1.determineGender();
		breed1.determineBreed();
		age1.determineAge();
		weight1.determineWeight();
		fleas1.determineFleas();
		behavior1.determineBehavior();

		// Prints the attributes of first dog
		System.out.println( "The name of the first dog is: " + name1.determineName() );
		System.out.println( "The gender of the first dog is: " + gender1.determineGender() );
		System.out.println( "The breed of the first dog is: " + breed1.determineBreed() );
		System.out.println( "The age of the first dog in months is: " + age1.determineAge() );
		System.out.println( "The weight of the first dog in pounds is: " + weight1.determineWeight() );
		System.out.println( "The first dog " + fleas1.determineFleas() );
		System.out.println( "The first dog's behavior is " + behavior1.determineBehavior() );

		System.out.println();

		// Creates objects of second dog
		Dog name2 = new Dog();
		Dog gender2 = new Dog();
		Dog breed2 = new Dog();
		Dog age2 = new Dog();
		Dog weight2 = new Dog();
		Dog fleas2 = new Dog();
		Dog behavior2 = new Dog();

		// Determines attributes of second dog
		name2.determineName();
		gender2.determineGender();
		breed2.determineBreed();
		age2.determineAge();
		weight2.determineWeight();
		fleas2.determineFleas();
		behavior2.determineBehavior();

		// Prints attributes of second dog
		System.out.println( "The name of the second dog is: " + name2.determineName() );
		System.out.println( "The gender of the second dog is: " + gender2.determineGender() );
		System.out.println( "The breed of the second dog is: " + breed2.determineBreed() );
		System.out.println( "The age of the second dog in months is: " + age2.determineAge() );
		System.out.println( "The weight of the second dog in pounds is: " + weight2.determineWeight() );
		System.out.println( "The second dog " + fleas2.determineFleas() );
		System.out.println( "The second dog's behavior is " + behavior2.determineBehavior() );
	}
}