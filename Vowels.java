import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner alphabet = new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");
        char vowels= alphabet.next().charAt(0);
        switch (vowels) {
            case 'a' -> System.out.println("This is a vowel that is 'a'.");
            case 'e' -> System.out.println("This is vowel that is 'e'.");
            case 'i' -> System.out.println("This is a vowel that is 'i'.");
            case 'o' -> System.out.println("This is a vowel that is 'o'.");
            case 'u' -> System.out.println("This is a vowel that is 'u'.");
            case 'A' -> System.out.println("This is a vowel that is 'A'.");
            case 'E' -> System.out.println("This is a vowel that is 'E'.");
            case 'I' -> System.out.println("This is a vowel that is 'I'.");
            case 'O' -> System.out.println("This is a vowel that is 'O'.");
            case 'U' -> System.out.println("This is a vowel that is 'U'.");
            default -> System.out.println("This is not a vowel.");}}}