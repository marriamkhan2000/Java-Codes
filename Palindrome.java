import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = str.next();
        int a, len = string.length();
        StringBuilder Reverse= new StringBuilder();
        for (a=len-1; a>=0; a--)
        { Reverse.append(string.charAt(a)); }
        if(string.equals(Reverse.toString()))
                    System.out.println("This string is palindromic.");
        else System.out.println("This is not a palindromic string.");}}
