//when we create one new class from one existing class then it is called single level inheritance
class print
{
    public void p(String message)
    {
        System.out.println(message);
    }
};
class kb extends print
{
    private long bytes;
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
public class singlelevel2
{
    //java singlelevel2 4096
    public static void main(String arguments[])
    {
        long bytes = Long.parseLong(arguments[0]);
        //class object = new classname();
        kb k1 = new kb(bytes);
        float answer = k1.getKB(); //calling method of child class 
        k1.p("answer is = " + answer); //calling p method of parent class 
    }
}