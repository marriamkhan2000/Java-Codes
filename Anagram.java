import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        String one; String two;
        Scanner str1 = new Scanner(System.in);
        System.out.println("Enter your first String:");
        one= str1.nextLine();
        Scanner str2 = new Scanner(System.in);
        System.out.println("Enter your second String:");
        two = str2.nextLine();
        char[] char1 = one.toCharArray();
        char[] char2 = two.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1, char2))
            System.out.println("These strings are anagram.");
            else System.out.println("These strings are not anagram.");}}
