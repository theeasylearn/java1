class Conversion
{
    public void p(String message)
    {
        System.out.print(message);
    }
    public void toBinary(int number)
    {
        if(number>0)
        {
            int reminder = number%2;
            number = number/2; //12
            toBinary(number); //recursion
            p("" + reminder);
        }
        else 
            return; //function is over 
    }
    public void toOctal(int number)
    {
        System.out.println("");
        p("" + number);
    }
}
public class recursion1
{
    public static void main(String arguments[])
    {
        Conversion d1 = new Conversion();
        d1.toBinary(25);
        d1.toOctal(25);
    }
}