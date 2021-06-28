abstract class box 
{
    abstract public void detail();  //because method is abstract we have to make class abstract
    public void p(String message)
    {
        System.out.println(message);
    }
}
class TVBox extends box 
{
    //this class must Override detail() method 
    @Override
    public void detail()
    {
        p("I Am TVBox. my height is 60CM and width is 30CM");
    }
}
public class AbstractDemo
{
    public static void main(String arguments[])
    {
       // box b1 = new box(); //can not create object of abstract class
       TVBox t1 = new TVBox();

       t1.detail(); //calling method detail of TVBox class 
       t1.p("good bye..."); //calling method p of parent class box 

    }   
}