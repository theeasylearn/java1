class kitchen extends Thread 
{
    public void work()
    {
        int count=1;
        System.out.println("kitchen work start....");
        while(count<=1000)
        {
            System.out.println("Kitchen work says count = " + count);
            count++;
        }
        System.out.println("kitchen work completed....");
    }
    public void run()
    {
        work();
    }
}
class office extends Thread
{
    public void work()
    {
        int count=1;
        System.out.println("office work start....");
        while(count<=1000)
        {
            System.out.println("office work says count = " + count);
            count++;
        }
        System.out.println("office work completed....");
    }
    public void run()
    {
        work();
    }
}
public class thread1
{
    public static void main(String arguments[])
    {
        office o1 = new office();
        kitchen k1 = new kitchen();
        k1.start(); //actually it will call run method 
        o1.start(); //actually it will call run method 
    }
}