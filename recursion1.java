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
    //it is used to covert decimal number to convert in hexadecimal number
    public void toHexa(int number)
    {
        System.out.println("");
        if(number>0)
        {
            int reminder=number%16;
            number = number / 16;
            toHexa(number);
            if(reminder==10)
                p("A");
            else if(reminder==11)
                p("B");    
            else if(reminder==12)
                p("C");
            else if(reminder==13)
                p("D");
            else if(reminder==14)
                p("E");    
            else if(reminder==15)
                p("F");     
            else
                p("" + reminder);
                
        }
        else 
        {
            return;
        }
    }
}
public class recursion1
{
    public static void main(String arguments[])
    {
        Conversion d1 = new Conversion();
        d1.toBinary(25);
        //d1.toOctal(25);
        d1.toHexa(456789123);
    }
}