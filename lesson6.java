import java.util.Scanner;
public class lesson6
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        int a,b,max;
        Scanner input = new Scanner(System.in);
        p("Enter first number");
        a = input.nextInt();
        p("Enter second number");
        b = input.nextInt();
        //ternary operator 
        max = (a>b) ? a : b;
        p("maximum number is " + max);
    }
}