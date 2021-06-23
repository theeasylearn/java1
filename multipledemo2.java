interface shape
{
    public final float PI = 3.14f;
    public float getArea();
}
class print 
{
    public void p(String message)
    {
        System.out.println(message);
    }
}
class rectangle extends print  implements shape 
{
   private float length,width;
   public rectangle(float length,float width)
   {
       this.length = length;
       this.width = width;
   }

   @Override
   public float getArea()
   {
       return length * width;
   }

}
public class multipledemo2
{
    //java multipledemo length,width
    public static void main(String arguments[])
    {
        float length,width;
        length = Float.parseFloat(arguments[0]);
        width = Float.parseFloat(arguments[1]);
        rectangle r1 = new rectangle(length,width);
        float area = r1.getArea();
        r1.p("area = " + area);
    }
}