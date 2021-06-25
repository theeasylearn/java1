class Student
{
    //instance variable 
    private int rollno;
    private String name,surname;
    private boolean gender;

    //paramterized constructor 
    public Student(int rollno,String name,String surname,boolean gender)
    {
        this.rollno = rollno;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        String temp; //local variable
        temp = "RollNo = " + rollno + " name = " + name + " surname = " + surname + " gender = ";
        if(gender==true)
        {
            temp+= " Male";
        }
        else 
        {
            temp+= " Female";
        }
        return temp;
    }
    @Override
    public boolean equals(Object myobject)
    {
        Student temp = (Student) myobject; //type casting into Student 
        if(rollno==temp.rollno && name.equals(temp.name)==true && surname.equals(temp.surname)==true && gender==temp.gender)
            return true;
        else
            return false;
    }
}
public class ObjectDemo
{
    public static void p(Object message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Student s1 = new Student(1,"Shiv","God",true);
        Student s3 = new Student(1,"Shiv","God",true);
        p(s1);  //actually it will call toString() method of student class
        p(s3);  //actually it will call toString() method of student class
        Student s2 = new Student(2,"Vishnu","God",true);
        p(s2); //actually it will call toString() method of student class

        if(s1.equals(s3)==true)
        {
            p("both s1 and s3 are same");
        }
        else 
        {
            p("both s1 and s3 are not same");
        }
    }
}