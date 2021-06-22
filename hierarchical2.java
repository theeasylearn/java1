//when more then one new class is created from one existing class it is called hierarchical inheritance.
class shape 
{
    public void p(String message)
    {
        System.out.println(message);
    }
    public float getPi()
    {
        return 3.14f;
    }
}
class circle extends shape 
{
    private int radius;
    public circle(int radius)
    {
        this.radius = radius;       
    }
    public float getArea()
    {
       //pi * r * r
       float area = getPi() * radius * radius;
       return area;
    }
}

class cylinder extends shape
{
    private int height,radius;
    public cylinder(int height,int radius)
    {
        this.radius = radius;       
        this.height = height;       
    }
    public float getVolume()
    {
       float volume = getPi() * radius * radius * height;
       return volume;
    }
}
class hierarchical2
{
    public static void main(String arguments[])
    {
        int radius = Integer.parseInt(arguments[0]);
        int height = Integer.parseInt(arguments[1]);
        circle c1 = new circle(radius);
        float area = c1.getArea();
        c1.p("area is " + area);

        cylinder c2 = new cylinder(height,radius);
        float volume = c2.getVolume();
        c2.p("volume is" + volume);
    }    
}