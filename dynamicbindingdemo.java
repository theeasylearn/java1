interface shape 
{
    public void example();
}
class circle implements shape
{
    public void IAmCircle()
    {
        System.out.println("I am Circle");
    }
    @Override
    public void example()
    {
        System.out.println("Dish, Clock, Wheels....");
    }
}
class square implements shape
{
    public void IAmSquare()
    {
        System.out.println("I am square");
    }
    @Override
    public void example()
    {
        System.out.println("LunchBox Table Chair ....");
    }
}
class triangle implements shape
{
    public void IamTrinagle()
    {
        System.out.println("I am triangle");        
    }
    @Override
    public void example()
    {
        System.out.println("Parks Piramids Bingo ....");
    }
}
public class dynamicbindingdemo
{
    public static void PrintDetail(shape s1)
    {
        if(s1 instanceof  circle)
        {
            circle c1 = (circle)s1;
            c1.IAmCircle();
        }
        else if(s1 instanceof  triangle)
        {
            triangle t1 = (triangle) s1;
            t1.IamTrinagle();
        }
        else if(s1 instanceof  square)
        {
            square s2 = (square) s1;
            s2.IAmSquare();
        }
        s1.example(); //dynamic binding
    }
    public static void main(String arguments[])
    {
        circle c1 = new circle();
        triangle t1 = new triangle();
        square s1 = new square();
        PrintDetail(c1);
        PrintDetail(t1);
        PrintDetail(s1);
    }

}