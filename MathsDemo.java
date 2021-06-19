public class MathsDemo
{
    /* function overloading */

    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void p(float message)
    {
        System.out.println(String.valueOf(message));
    }
    public static void p(int message)
    {
        System.out.println(String.valueOf(message));
    }
    public static void main(String[] arguments)
    {
        float value = Float.parseFloat(arguments[0]);
        p("Hello"); //string version execute
        p(10); //integer version called
        p(value); //float version execute
        double lessvalue = Math.floor(value);
        p("floor value " + lessvalue); 
        double morevalue = Math.ceil(value);
        p("ceil value " + morevalue); 
        double exactvalue = Math.round(value);
        p("rounded value " + exactvalue); 
        double result = Math.sqrt(value);
        p("square root " + result); 
        long number1 = Math.round(Math.random() * 100);
        long number2 = Math.round(Math.random() * 100);
        long number3 = Math.round(Math.random() * 100);
        String otp = String.valueOf(number1) + String.valueOf(number2) + String.valueOf(number3);
        p("OTP = " + otp);
        p("minimum number is " + Math.min(number1,number2));
        p("maximum number is " + Math.max(number1,number2));
    }
}