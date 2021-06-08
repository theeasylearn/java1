import java.util.Scanner;
class friends
{
    //instance variable 
    //datatype variablename[] OR
    //datatype[] variablename
    private String list[]; //declration 
    private int size,index;
    public friends(int size)
    {
        this.size = size;
        //memory allocation for array
        //arrayname = new datatype[size]
        list = new String[size];
        index =-1;
    } 
    public void insert(String name)
    {
        if(index==size-1) //9==9
            p("friend list is full");
        else 
        {
            index++; //2
            list[index] = name;
        }
    }
    public void display()
    {
        if(index==-1) //9
            p("no friends.....");
        else 
        {
            int temp=0; 
            while(temp<=index) //0<=9
            {
                p("name = " + list[temp]);//KRUSHA MOHAN RAM KRISHNA SHIVA 
                temp++;
            }
        }
    }
    public void p(String message)
    {
        System.out.println(message);
    }
    public int search(String name) //RAM
    {
        if(index==-1)
            p("no friends.....");
        else 
        {
            int temp=0; //0
            while(temp<=index) //2<=9
            {
                if(name.equals(list[temp])==true)
                    return temp; //0 
                temp++;
            }
        }
        return -1; //-1 not found
    }
    public void delete(String name) //krusha
    {
        int position = search(name);
        if(position!=-1)
        {
            list[position]="";
            p("friend removed....");
        }
    }
    public void update(String name_to_search,String new_name)
    {
        int position = search(name_to_search);
        if(position!=-1)
        {
            list[position]=new_name;
            p("friend renamed");
        }
    }
};
public class lesson10
{
    public static void main(String arguments[])
    {
        int choice;
        friends f1 = new friends(10);
        String name,new_name;
    do 
    {
        f1.p("Press 1 to add new friend");
        f1.p("Press 2 to display all friend");
        f1.p("Press 3 to delete existing friend");
        f1.p("Press 4 to search friend");
        f1.p("Press 5 to update existing friend ");
        f1.p("Press 0 to exit ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        switch(choice)
        {
            case 1:
            f1.p("enter your friend name to add in list");
            name = input.next();
            f1.insert(name);
            break;
            case 2:
            f1.display();
            break;
            case 3:
            f1.p("enter your friend name to remove from list");
            name = input.next();
            f1.delete(name);
            break;
            case 4:
            f1.p("enter your friend name to search in list");
            name = input.next();
            int position = f1.search(name);
            if(position==-1)
                f1.p("not found");
            else 
                f1.p("found at " + (position+1));
            break;

            case 5:
            f1.p("enter your friend name to update in list");
            name = input.next();
            f1.p("enter your friend new name");
            new_name = input.next();
            f1.update(name,new_name);
            break;
            case 0:
            f1.p("Good Bye.....");
            break;
            default:
            f1.p("invalid choice....");
            break;
        }
    }while(choice!=0);
        
    }
}