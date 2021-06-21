//when we create one new class from one existing class then it is called single level inheritance
class father
{
    public void farm()
    {
        System.out.println("i have farm....");
    }
};
class child extends father 
{
    public void business()
    {
        System.out.println("i have one business....");
    }
    public void property()
    {
        business(); //calling method of same class 
        farm();
    }
};
public class singlelevel
{
    public static void main(String arguments[])
    {
        //classname object = new classname()
        father f1 = new father();
        f1.farm();
        //f1.property(); wont work because we can not call method of child class from father class object

        child c1 = new child();
        c1.property(); //it will call farm() method of parent class and business method of child class
    }
}