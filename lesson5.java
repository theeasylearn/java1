/* simple interest calculator */
import java.util.Scanner;
public class lesson5
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        int a,b;
        Scanner input = new Scanner(System.in);
        p("Enter first number");
        a = input.nextInt();
        p("Enter second number");
        b = input.nextInt();
        if(a>b)
        {
            p("a is bigger " + a);
        }       
        else 
        {
            p("b is bigger " + b);
        }
    }
}