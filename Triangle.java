public class Triangle {
    public static void main(String[] args)
    {
        for(int a=1;a<=5;a++)
        {for(int b=1;b<=5-a;b++)
            {System.out.print(" ");}
            for(int c=1;c<=a*2-1;c++)
            {System.out.print("*");}
            System.out.println();
        }
    }
}
