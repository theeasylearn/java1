import java.util.Scanner;
class square
{
   //instance variable 
   private int length,width; 

   //setter method
   public void setLength(int value) //100
   {
       length = value;
   }
   public void setWidth(int value)
   {
       width = value;
   }
   //getter method 
   public int getLength()
   {
       return length;
   }
   public int getWidth()
   {
       return width;
   }
   public int getArea()
   {
       int area; //local variable 
       area = length * width;
       return area;
   }
}
public class lesson7
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        //class object = new class()
        square s1 = new square(); //s1 is object 
        //below two line will not work because length and width are private and private can not be accessed/changed outside class in which it is declared.
        // s1.length = 100;
        // s1.width = 200;
        Scanner input = new Scanner(System.in);
        p("Enter length");
        int length = input.nextInt();
        p("Enter width");
        int width = input.nextInt();
        s1.setLength(length); // it will call setLength method of s1 object and pass 100 into it 
        s1.setWidth(width); // it will call setWidth method of s1 object and pass 100 into it 
        int area; //local variable 
        area = s1.getArea();
        p("length = " + s1.getLength());
        p("width = " + s1.getWidth());
        p("area is" + area);

    }
}