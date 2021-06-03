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
        if(index==size-1)
            p("friend list is full");
        else 
        {
            index++; //0
            list[index] = name;
        }
    }
    public void display()
    {
        if(index==-1)
            p("no friends.....");
        else 
        {
            int temp=0;
            while(temp<=index)
            {
                p("name = " + list[temp]);
                temp++;
            }
        }
    }
    public void p(String message)
    {
        System.out.println(message);
    }
    public int search(String name)
    {
        if(index==-1)
            p("no friends.....");
        else 
        {
            int temp=0;
            while(temp<=index)
            {
                if(name.equals(list[temp])==true)
                    return temp; 
                temp++;
            }
        }
        return -1; //-1 not found
    }
    public void delete(String name)
    {
        int position = search(name);
        if(position!=-1)
        {
            list[position]="";
            p("friend removed....");
        }
    }
};
public class lesson10
{
    public static void main(String arguments[])
    {
        friends f1 = new friends(10);
        f1.insert("Krusha");
        f1.insert("mohan");
        f1.insert("ram");
        f1.insert("shiva");
        f1.insert("vishnu");
        f1.display();
        int position = f1.search("ram");
        f1.p("ram position is " + position);

        position = f1.search("hanuman");
        f1.p("ram position is " + position);
        f1.delete("Krusha");
        f1.delete("Ankit");
        f1.display();
    }
}