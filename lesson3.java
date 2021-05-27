import java.util.Scanner;
public class lesson3
{
    //user defined function 
    //visibility keywords return-type function-name
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        short daily_ income;
        byte age;
        int monthly_income;
        long yearly_income;

        float weight;
        double accurate_weight;
        char letter;
        String name;
        boolean gender; 

        //create object 
        //classname objectname = new classname()
        Scanner input = new Scanner(System.in);
        p("Enter your name");
        name = input.next(); //next() it is used to accept string from user (without space)
        p("enter daily income");
        daily_income = input.nextShort(); //it is used to accept short value from user 
        p("enter monthly income");
        monthly_income = input.nextInt();
        p("enter yearly income");
        yearly_income = input.nextLong();

        p("enter your weight");
        weight = input.nextFloat();

        p("enter your accurate weight");
        accurate_weight = input.nextDouble();


    }
}