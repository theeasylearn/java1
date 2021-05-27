/* simple interest calculator */
import java.util.Scanner;
public class lesson4
{
    //user defined function 
    //visibility keywords return-type function-name
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Scanner input = new Scanner(System.in);
        int amount;
        float rate,interest;
        byte year;
        
        //input 
        p("enter amount");
        amount = input.nextInt(); 

        p("enter rate");
        rate = input.nextFloat();

        p("enter year");
        year = input.nextByte();

        //process 
        interest = (amount * rate * year) / 100;
        
        //output
        p("simple interest = " + interest);

        
    }
}