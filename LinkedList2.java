import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class LinkedList2
{
    public static void p(Object message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Scanner input = new Scanner(System.in);
        int number;
        LinkedList<Integer> NumberList = new LinkedList<Integer>();
        do
        {
            p("enter number");
            number = input.nextInt();
            NumberList.add(number);
        }while(number!=0);
        
        Iterator<Integer> traveller = NumberList.iterator();
        while(traveller.hasNext()==true)
        {
            p(traveller.next());
        }
    }
}