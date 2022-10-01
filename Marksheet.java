import java.util.Scanner;
public class Marksheet {
    public static void main(String[] args) {
        float English,Urdu,Maths,Sum;
        int Roll_No,Total_Marks=300;
        String Name;
        double Percentage;
        Scanner sheet= new Scanner(System.in);
        System.out.println("Enter Name:");
        Name= sheet.nextLine();
        System.out.println("Enter Roll Number: ");
        Roll_No= sheet.nextInt();
        System.out.println("Obtained Marks in English: ");
        English= sheet.nextInt();
        System.out.println("Obtained Marks in Urdu: ");
        Urdu= sheet.nextInt();
        System.out.println("Obtained Marks in Maths: ");
        Maths= sheet.nextInt();
        Sum=English+Urdu+Maths;
        Percentage=(Sum/Total_Marks)*100;
        System.out.println("Mark sheet:");
        System.out.println("Name:"+"                                "+Name);
        System.out.println("Roll Number:"+"                         "+Roll_No);
        System.out.println("--------------------------------------------------");
        System.out.println("English:"+"                             "+English);
        System.out.println("Urdu:"+"                                "+Urdu);
        System.out.println("Maths:"+"                               "+Maths);
        System.out.println("Obtained Marks:"+"                      "+Sum);
        System.out.println("--------------------------------------------------");
        System.out.println("Total Percentage:"+"                    "+Percentage);}}
