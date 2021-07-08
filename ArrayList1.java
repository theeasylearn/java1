import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class ArrayList1
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Scanner input = new Scanner(System.in);
        String dish = new String();
        ArrayList<String> DishList = new ArrayList<String>();
        do
        {
            p("enter dish name");
            dish = input.nextLine();
            DishList.add(dish);
        }while(dish.trim().length()!=0);
        
        Iterator<String> traveller = DishList.iterator();
        while(traveller.hasNext()==true)
        {
            p(traveller.next());
        }
    }
}