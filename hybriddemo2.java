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
class RectangleVolume extends rectangle
{
    private float height;
    public RectangleVolume(float length,float width,float height)
   {
      super(length,width);
      this.height = height;
   }
   public float getVolume()
   {
       float volume = getArea()  * height;
       return volume;
   }
}
public class hybriddemo2
{
    //java hybriddemo2 length width height
    public static void main(String arguments[])
    {
        float length,width,height;
        length = Float.parseFloat(arguments[0]);
        width = Float.parseFloat(arguments[1]);
        height = Float.parseFloat(arguments[2]);
        RectangleVolume rv1 = new RectangleVolume(length,width,height);
        float volume = rv1.getVolume();
        rv1.p("volume = " + volume);
    }
}