import java.util.Random; //random class is used to generate random values
class MyMath
{
    //method overloading
    public static int max(float a, float b)
    {
        if(a>b)
            return (int)(a);
        else 
            return (int)(b);
    }

    public static int max(int a,int b)
    {
        if(a>b)
            return a;
        else 
            return b;
    }
    public static int max(int a,int b,int c)
    {
        if(a>b)
        {
            if(a>c)
                return a;
            else 
                return c;
        }
        else 
        {
            if(c>b)
                return c;
            else 
                return b;
        }
    }
    public static int max(float a,float b,float c)
    {
        if(a>b)
        {
            if(a>c)
                return (int)(a);
            else 
                return (int)(c);
        }
        else 
        {
            if(c>b)
                return (int)(c);
            else 
                return (int)(b);
        }
    }
}
public class lesson8{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Random r1 = new Random();
        int a = r1.nextInt(); //integer number will be generated
        int b = r1.nextInt(); //integer number will be generated
        int c = r1.nextInt(); //integer number will be generated
        int max = MyMath.max(a,b); //2 argument integer version called
        p("maximum number from 2 number is " + max);
        max = MyMath.max(a,b,c); //3 argument integer version called
        p("maximum number from 3 number is " + max);

        float x = r1.nextFloat() * 100; //float number will be generated
        float y = r1.nextFloat() * 100; //float number will be generated
        float z = r1.nextFloat() * 100; //float number will be generated

        max = MyMath.max(x,y); //2 argument float version called
        p("maximum number from 2 number is " + max);
        max = MyMath.max(x,y,z); //3 argument float version called
        p("maximum number from 3 number is " + max);

    }
}