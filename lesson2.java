//write a program to declare various data type variable in print its value on screen 
public class lesson2
{
    public static void main(String arguments[])
    {
        //type of integer variable
        int income; //4 bytes
        long yearly_income; //8 bytes
        short daily_income=25000; //2 bytes
        byte age; //1 bytes 

        //type of decimal variable (float)
        float weight; //4 bytes 
        double latitude,longitude; //8 byte 

        //char type
        char letter; //2 byte  it can store any one alphabet/symbol/digit 

        //String type
        String name; // it can store words including space like krusha rawal

        //boolean value
        boolean  gender; 

        income = daily_income * 30;
        yearly_income = income * 12; 
        age = 21;
        weight = 25.45f ;
        latitude = 21.141516;
        longitude = 72.141516;
        gender = true;
        letter = 'K';
        name = "Krusha Rawal";

        System.out.println("name = " + name);
        System.out.println("letter = " + letter);
        System.out.println("latitude = " + latitude + " longitude = " + longitude + " weight =" + weight);
        System.out.println(daily_income + " is my daily income");
        System.out.println(yearly_income + " is my yearly income");
        System.out.println("" + income);
        System.out.println(String.valueOf(income));
    }
}