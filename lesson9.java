import java.util.Random; //random class is used to generate random values
//varag function 
//varag function a function in which we can pass any number of arguments 
class MyMath
{
    //method overloading
    public static int max(int ... list)
    {
        int size = list.length; //length return how many elements array list 
        int value = list[0];
        int position = 1;
        while(position<size)
        {
            if(value<list[position])
                value = list[position];
            position++;
        }
        return value;
    }
}
public class lesson9{
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
        int d = r1.nextInt(); //integer number will be generated
        int max = MyMath.max(a,b); //varag function 
        p("max = " + max);
        max = MyMath.max(a,b,c); //varag function 
        p("max = " + max);
        max = MyMath.max(a,b,c,d); //varag function 
        p("max = " + max);

    }
}