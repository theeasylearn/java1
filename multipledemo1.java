interface study
{
    //final variables 
    public final String COLLEGE = "SUNRISE COLLEGE";
    public final int YEAR = 1980;
    public void lab(); //no code means abstract method
    public void classroom(); //no code means abstract method 
    
}
class company 
{
    public void p(String message)
    {
        System.out.println(message);
    }
    public void work()
    {
        p("we develope software on php, asp.net, vb.net platforms");
    }
}
class mycompany extends company implements study
{
    @Override
    public void lab()
    {
        p("I am lab I have computers, WIFI, Printers chairs etc");
    }
    @Override
    public void classroom()
    {
        p("I have stage, chairs, blackboard etc...");
    }
    public void canteen()
    {
        p("we have different dishes in our canteen on daily basis");
    }
}
public class multipledemo1
{
    public static void main(String arguments[])
    {
        mycompany m1 = new mycompany();
        m1.lab();
        m1.classroom();
        m1.work();
        m1.canteen();
    }
}