//when we create one new class from child(dervied) class then it is called multilevel inheritance
class grandfather
{
    public void swards()
    {
        System.out.println("i have swards....");
    }
}
class father extends grandfather
{
    //farm() swards()
    public void farm()
    {
        System.out.println("i have farm....");
    }
};
class child extends father 
{
    //business farm swards()
    public void business()
    {
        System.out.println("i have one business....");
    }
    public void property()
    {
        swards(); // it will call grand parent class method
        farm(); //it will parent class method 
        business(); //calling method of same class 
    }
};
public class multilevel
{
    public static void main(String arguments[])
    {
        //classname object = new classname()
        child c1 = new child();
        c1.property(); //it will call farm() method of parent class and business method of child class
    }
}