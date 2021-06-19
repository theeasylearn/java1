public class CommandLineArgumentDemo
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    //arguments is string array and it has all arguments passed when user run program with values
    //java MathsDemo India Gujarat Bhavnagar 100
    //               0     1       2         3   
    public static void main(String[] arguments)
    {
        if(arguments.length>=3)
        {
            p("first value " + arguments[0]);
            p("second value " + arguments[1]);
            p("third value " + arguments[2]);
        }
        else 
        {
            p("not enough arguments");
        }
    }
}