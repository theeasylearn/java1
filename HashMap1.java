import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
public class HashMap1
{
    public static void p(Object message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Scanner input = new Scanner(System.in);
        String value = new String();
        String key = new String();
        HashMap<String,String> NameList = new HashMap<String,String>();
        int choice;
        do 
        {
            p("Press 1 to add new key value in NameList");
            p("Press 2 to remove key value from NameList");
            p("Press 3 to search value using key in NameList");
            p("Press 4 to update update value using key in NameList");
            p("Press 5 to print all key value pair in NameList");
            p("Press 0 to exit");
            p("now enter your choice");
            choice = input.nextInt();
            switch(choice)
            {
                case 1: //choice==1
                p("enter new key");
                key = input.next();
                p("enter new value");
                value = input.next();
                NameList.put(key,value); //add new string value in ArrayList
                break;

                case 2: //choice==2
                p("enter key to remove key/value from list ");
                key = input.next();
                NameList.remove(key);
                break;

                case 3: //choice==3
                p("enter key to search its value in list ");
                key = input.next();
                if(NameList.containsKey(key)==true)
                    p("key Found....");
                else
                    p("key Not Found....");
                break;

                case 4: //choice==4
                //in case of updating value in HashSet first search value you want to update
                //then if found first remove existing value using remove method & then add NewValue using add method
                p("enter key to search & update its value in list ");
                key = input.next();
                if(NameList.containsKey(key)==true)
                {
                    p("Enter new value ");
                    input = new Scanner(System.in);
                    String NewName = input.nextLine();
                    NameList.put(key,NewName);
                    p("key value pair updated successfully....");
                }
                else 
                {
                   p("name not found...");
                }
                break;
                case 5: //choice==5
                Iterator traveller = NameList.entrySet().iterator();
                while(traveller.hasNext()==true)
                {
                     Map.Entry KeyValue = (Map.Entry) traveller.next();
                     System.out.println("Key: "+ KeyValue.getKey() + " & Value: " + KeyValue.getValue());
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