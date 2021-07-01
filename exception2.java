import java.util.Scanner;
import java.util.InputMismatchException;
public class exception2
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        float number1,number2;
        Scanner input = new Scanner(System.in);
        Boolean isError = true; //we assume all program has error 
        while(isError==true)
        {
            try 
            {
                p("Enter first number");
                number1 = input.nextFloat();
                
                p("Enter second number");
                number2 = input.nextFloat();
                if(number2==0)
                {
                    p("number2 can not be zero");
                    continue;
                }
                float result = number1/number2;
                p("result is " + result);
                isError = false;
            }
            catch(InputMismatchException error)
            {
                p("its seems you data is invalid. please give only integer numbers");
                input = new Scanner(System.in);
            }
        }
    }
}