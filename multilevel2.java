//when we create new class from derived class then it is called multilevel inheritance
class print //grand parent
{
    public void p(String message)
    {
        System.out.println(message);
    }
};
class kb extends print //parent 
{
    private long bytes;
    //paramterized constructor
    public kb(long bytes)
    {
        p("parameterized constructor called.."); //calling parent class method 
        this.bytes = bytes;
    }
    public float getKB()
    {
        return bytes/1024.0f;
    }
}
class mb extends kb  //child class
{
    //mb class must paramterized constructor because its parent class has parameterized constructor 
   public mb(long bytes)
   {
       super(bytes); //is compulsory to call parent class constructor from child class constructor
   } 
   public float getMB()
   {
       float temp = getKB(); //return kilobytes 
       temp = temp /1024.0f; //MB
       return temp; //MB

   }
}
public class multilevel2
{
    //java multievel2 4096
    public static void main(String arguments[])
    {
        long bytes = Long.parseLong(arguments[0]);
        //class object = new classname();
        mb m1 = new mb(bytes); //it will call constructor of mb class 
        float result = m1.getMB();
        m1.p("MB = " + result);
    }
}