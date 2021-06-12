pubic class constantdemo
{
    public static final int RETIREMENT_AGE = 60;
    public final float PI=3.14f;
    public float weight;
    public static void main(String arguments[])
    {
        System.out.println("" + RETIREMENT_AGE);
        int age;
        if(age<RETIREMENT_AGE)
        {
            p("you are still able to work");
        }
        else 
        {
            p("you are not eligible to work");
        }
    }
}