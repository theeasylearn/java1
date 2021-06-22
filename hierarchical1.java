//when more then one new class is created from one existing class it is called hierarchical inheritance.
class human 
{
    public void p(String message)
    {
        System.out.println(message);
    }
    public void task()
    {
        p("I can read, write, walk, cry, sleep, eat, lough, run etc");
    }
}
class doctor extends human 
{
    public void work()
    {
        task(); //calling parent class method task 
        p("I can check patient and  do diagnosis  of their dieases "); //calling parent class method p 
    }
}
class tailor extends human
{
    public void work()
    {
         task(); //calling parent class method task 
         p("I can make cloaths for humans like shirts & pents etc");
    }
}
class hierarchical1
{
    public static void main(String arguments[])
    {
        doctor d1 = new doctor();
        d1.work(); //calling work method of doctor class because d1 is object of doctor class 

        tailor t1 = new tailor();
        t1.work(); //calling work method of tailor class because t1 is object of tailor class 
    }    
}