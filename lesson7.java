import java.util.Scanner;
class bmi
{
    //instance variable 
    private float weight;
    private byte foot,inch;
    //default constructor means constructor without any arguments
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
    //parameterized constructor means constructor with one or more arguments
    public bmi(float weight,byte foot,byte inch)
    {
        p("3 argument parameterized constructor called....");
        this.weight = weight;
        this.foot = foot;
        this.inch = inch;
    }

    public bmi(float weight,byte foot)
    {
        p("2 argument parameterized constructor called....");
        this.weight = weight;
        this.foot = foot;
        this.inch = 0;
    }
    //copy constructor means construct with argument of same class in which it is 
    public bmi(bmi source)
    {
        p("copy contructor called...");
        weight = source.weight;
        foot = source.foot;
        inch = source.inch;

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

        float weight;
        byte foot,inch;
        Scanner input = new Scanner(System.in); //local
        b1.p("enter weight in kg");
        weight = input.nextFloat();
        b1.p("enter height (in foot & inches)");
        b1.p("enter foot");
        foot = input.nextByte();
        b1.p("enter inch (<12)");
        inch = input.nextByte();
        //create bmi class object using 3 argument parameterized constructor
        bmi b2 = new bmi(weight,foot,inch);               

        bmivalue = b2.getBmi();
        b2.p("bmi is " + bmivalue); 

        //create bmi class object using 2 argument parameterized constructor
        bmi b3 = new bmi(weight,foot);
        bmivalue = b3.getBmi();
        b3.p("bmi is " + bmivalue); 

        //create bmi class object using copy constructor 
        bmi b4 = new bmi(b1);
        bmivalue = b4.getBmi();
        b4.p("bmi value is " + bmivalue);

    }
}