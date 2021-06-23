interface study
{
    //final variables 
    public final String COLLEGE = "SUNRISE COLLEGE";
    public final int YEAR = 1980;
    public void lab(); //no code means abstract method
    public void classroom(); //no code means abstract method 
    
}
class IT implements study
{
    public void p(String message)
    {
        System.out.println(message);
    }
    
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
}
public class interfacedemo
{
    public static void main(String arguments[])
    {
        //study s1 = new study(); //error
        IT i1 = new IT();
        i1.lab();
        i1.classroom();

    }
}