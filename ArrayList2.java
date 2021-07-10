import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class ArrayList2
{
    public static void p(Object message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Scanner input = new Scanner(System.in);
        String name = new String();
        ArrayList<String> NameList = new ArrayList<String>();
        int choice;
        do 
        {
            p("Press 1 to add new name in NameList");
            p("Press 2 to remove name from NameList");
            p("Press 3 to search name in NameList");
            p("Press 4 to update name in NameList");
            p("Press 5 to print all names in NameList");
            p("Press 0 to exit");
            p("now enter your choice");
            choice = input.nextInt();
            switch(choice)
            {
                case 1: //choice==1
                p("enter new name");
                name = input.next();
                NameList.add(name); //add new string value in ArrayList
                break;

                case 2: //choice==2
                p("enter name to remove from list ");
                name = input.next();
                NameList.remove(name);
                break;

                case 3: //choice==3
                p("enter name to search in list ");
                name = input.next();
                if(NameList.contains(name)==true)
                    p("Name Found....");
                else
                    p("Name Not Found....");
                break;

                case 4: //choice==4
                p("enter name to search & update in list ");
                name = input.next();
                int position = NameList.indexOf(name); //return position of name in NameList if not found it returns -1 
                if(position!=-1)
                {
                    p("Enter new name ");
                    input = new Scanner(System.in);
                    String NewName = input.nextLine();
                    NameList.set(position,NewName); //update value at given position
                    p("name updated successfully....");
                }
                else 
                {
                   p("name not found...");
                }
                break;
                case 5: //choice==5
                Iterator traveller = NameList.iterator();
                while(traveller.hasNext()==true)
                {
                    p(traveller.next());
                }
                break;

                case 0: //choice==0
                    p("Good bye...");
                break;

                default:
                p("invalid choice....");
                break;
            } //end of switch 
        }while(choice!=0);        
    }// end of main 
} //end of class 