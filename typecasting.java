public class typecasting
{
    static int i=0; //integer //3
    static float f=3.14f; //float 3.49
    static double location=21.1234567890;
    public static void main(String arguments[])
    {
        //i /*  destination */ = f /* source */; //error

        i = (int)f;  //typecasting required
        f = (float) location;  //typecasting is required 
    }
}