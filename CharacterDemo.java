import java.util.Scanner;
public class CharacterDemo
{
    /* function overloading */

    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void p(char message)
    {
        System.out.println(String.valueOf(message));
    }
    public static void p(int message)
    {
        System.out.println(String.valueOf(message));
    }
    public static void main(String[] arguments)
    {
        Scanner input = new Scanner(System.in);
        p("Enter your full name");
        String fullname = input.nextLine(); //used to accept String with space 
        p(fullname);
        int position=0,letter=0,digit=0,words=1,symbol=0,upper=0,lower=0;
        int size = fullname.length(); //return how many character string has 
        
        while(position<size)
        {
            char c = fullname.charAt(position);
            if(Character.isLetter(c)==true)
            {
                letter++;
                if(Character.isUpperCase(c)==true)
                    upper++;
                else 
                    lower++;   
            }
            else if(Character.isDigit(c)==true)
                digit++;
            else if(Character.isSpace(c)==true)
                words++;
            else 
                symbol++;
            position++; //1
        }
        p("letter = " + letter);       
        p("lower = " + lower);       
        p("upper = " + upper);       
        p("digit = " + digit);       
        p("words = " + words);       
        p("symbol = " + symbol);       
    }
}