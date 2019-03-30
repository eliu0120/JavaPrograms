import java.util.Scanner;

public class Assignment7part1 {
    public static void main(String[] args) {
        /* Creates variables for prompt */
        double n = 0;
        double i = 0;
        double j = 0;

        /* Prompts user to input data for variables */
        n = Input.getInt("Please enter the weight of an object on Earth");
        i = Input.getInt("Please enter the weight of an object on the moon");
        j = Input.getInt("Please enter the weight of an object on Mars");

        /* Converts the returned variables into different variables to be used in the text */
        double z = Weight_on_Mars(n);
        double x = Weight_on_Moon(n);
        double y = Moon_to_Earth(i);
        double w = Mars_to_Earth(j);

        /* Displays the weight conversions */
        System.out.println("\nThe weight of the object from Earth on Mars is: " + z);
        System.out.println("\nThe weight of the object from Earth on the moon is: " + x);
        System.out.println("\nThe weight of the object from the moon on the Earth is: " + y);
        System.out.println("\nThe weight of the object from Mars on Earth is: " + w);

    }

    /* Methods for calculations */
    public static double Weight_on_Mars(double n) {
        double weight = (n / 9.81) * 3.711;
        return weight;
    }

    public static double Weight_on_Moon(double n) {
        double weight2 = (n / 9.81) * 1.622;
        return weight2;
    }

    public static double Moon_to_Earth(double i) {
        double weight3 = (i * 9.81) / 1.622;
        return weight3;
    }

    public static double Mars_to_Earth(double j) {
        double weight4 = (j * 9.81) / 3.711;
        return weight4;
    }
}
		