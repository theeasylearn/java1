final class triangle
{
    private int base,height;
    public triangle(int base,int height)
    {
        this.base = base; 
        this.height = height;
    }

    //any class can not Override this method
    public final float getArea()
    {
        float area = (height * base) / 2.0f;
        return area;
    }
};
//can not inherit final class it will give error if we try to inherit final class 
// class MyTriangle extends triangle
// {
//     public MyTriangle(int base,int height)
//     {
//         super(base,height);
//     }
// }
public class FinalDemo
{
    //java FinalDemo 10 50
    public static void main(String arguments[])
    {
        int base,height;
        base = Integer.parseInt(arguments[0]);
        height = Integer.parseInt(arguments[1]);
        triangle t1 = new triangle(base,height);
        float area = t1.getArea();
        System.out.println("Triangle area is " + area);
    }
}