import java.util.Scanner;
class MyException extends Exception 
{
    private String ErrorMessage;
    public MyException(String ErrorMessage)
    {
        this.ErrorMessage = ErrorMessage;
    }
    @Override
    public String toString()
    {
        return ErrorMessage;
    }
}
public class exception4
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
       Scanner input = new Scanner(System.in);
       try
       {
           p("Enter your name ");
           String name = input.next();

           //Check if String contains only letters
           boolean isOnlyLetters = name.chars().allMatch(Character::isLetter);
           if(name.trim().length()<=1 || isOnlyLetters==false)
           {
            throw new MyException("invalid name, name must be at least 2 letter long and only english alphabets are allowed...");
           }
           p("Welcome Mr/Miss/Mrs " + name);
       }
       catch(MyException error)
       {
           System.out.println(error); //it will call toString() method of MyException class
       }
    }
}