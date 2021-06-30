public class exception1
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    //java exception 10 20 
    public static void main(String arguments[])
    {
        int number1,number2;
        
        try 
        {
            number1 = Integer.parseInt(arguments[0]);
            number2 = Integer.parseInt(arguments[1]);
            float result = number1/number2;
            p("result is " + result);
        }
        catch(ArrayIndexOutOfBoundsException error)
        {
            //this block will run only if we try to access not existing array element 
            p("you must pass two integer value ");
        }
        catch(NumberFormatException error)
        {
            p("its seems you data is invalid. please give only integer numbers");
        }
        catch(ArithmeticException error)
        {
            p("its seems give zero in input. please given non zero integer value");
        }
    }
}