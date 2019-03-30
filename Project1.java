import java.util.Scanner;

public class Project1 {
    private static String uncode = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static String coded = "ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("\nEnter 1 to encode sentence or 2 to decode sentence:");
        int choice = input.nextInt();

        System.out.println();

        if (choice == 1) {
            System.out.println(encodeMessage(sentence));
        } else {
            System.out.println(decodeMessage(sentence));
        }
    }

    public static String encodeMessage(String sentence) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sentence.length(); i++) {
            sb.append(encode(sentence.charAt(i)));
        }
        return sb.toString();
    }

    public static String decodeMessage(String sentence) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sentence.length(); i++) {
            sb.append(decode(sentence.charAt(i)));
        }
        return sb.toString();
    }

    public static char encode(char input) {
        int i = 0;

        for (; i < uncode.length(); i++) {
            if (uncode.charAt(i) == input) {
                break;
            }
        }
        if (i >= uncode.length()) {
            return input;
        } else {
            return coded.charAt(i);
        }
    }

    public static char decode(char input) {
        int i = 0;

        for (; i < coded.length(); i++) {
            if (coded.charAt(i) == input) {
                break;
            }
        }
        if (i >= coded.length()) {
            return input;
        } else {
            return uncode.charAt(i);
        }
    }
}