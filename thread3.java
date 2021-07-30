class print 
{
    public void p(String message)
    {
        System.out.println(message);
    }
}
class kitchen extends print implements Runnable /* interface */
{
    public void work()
    {
        int count=1;
        System.out.println("kitchen work start....");
        while(count<=1000)
        {
            p("Kitchen work says count = " + count);
            count++;
        }
        System.out.println("kitchen work completed....");
    }
    public void run()
    {
        work();
    }
}
class office extends print implements Runnable /* interface */ 
{
    public void work()
    {
        int count=1;
        System.out.println("office work start....");
        while(count<=1000)
        {
            p("office work says count = " + count);
            count++;
        }
        System.out.println("office work completed....");
    }
    public void run()
    {
        work();
    }
}
public class thread3
{
    public static void main(String arguments[])
    {
        office o1 = new office(); 
        kitchen k1 = new kitchen();
        Thread o1_executor = new Thread(o1);
        Thread k1_executor = new Thread(k1);
        o1_executor.setPriority(6); //priority must be between 1 to 10 
        k1_executor.setPriority(4); //less value mean less execution more value more execution 
        o1_executor.start(); //actually it will call run method 
        k1_executor.start(); //actually it will call run method 
    }
}