import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class LinkedList1
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Scanner input = new Scanner(System.in);
        String friend = new String();
        LinkedList<String> FriendList = new LinkedList<String>();
        do
        {
            p("enter friend name");
            friend = input.nextLine();
            FriendList.add(friend);
        }while(friend.trim().length()!=0);
        
        Iterator<String> traveller = FriendList.iterator();
        while(traveller.hasNext()==true)
        {
            p(traveller.next());
        }
    }
}