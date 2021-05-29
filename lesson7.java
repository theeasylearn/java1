import java.util.Scanner;
class bmi
{
    //instance variable 
    private float weight;
    private byte foot,inch;
    //default constructor 
    public bmi() 
    {
        Scanner input = new Scanner(System.in); //local
        p("enter weight in kg");
        weight = input.nextFloat();
        p("enter height (in foot & inches)");
        p("enter foot");
        foot = input.nextByte();
        p("enter inch (<12)");
        inch = input.nextByte();
    }
    public float getBmi()
    {
        float meter,bmivalue; //local variable 
        meter = ((foot * 12) + inch) /39.37f ; //
        bmivalue = weight / (meter * meter);
        return bmivalue;
    }
    public void p(String message)
    {
        System.out.println(message);
    }
}
public class lesson7
{
    public static void main(String arguments[])
    {
        //class object = new class()
        bmi b1 = new bmi(); //default constructor 
        float bmivalue = b1.getBmi();
        b1.p("bmi is " + bmivalue);                
    }
}