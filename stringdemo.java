public class stringdemo
{
   
    public static void main(String arguments[])
    {
        //class object = new class()
        //1st way to create string
        String name = new String("The easylearn academy");
        System.out.println(name);

        //2nd method to create string
        String city;

        city = "Bhavnagar";
        System.out.println(city);

        city = "Shree ganga pur";
        System.out.println(city);


        //creating string buffer class object 
        StringBuffer address = new StringBuffer(1000); //it means you can store upto 1000 letter without any memory reallocation 

        address.append("105 Eva surbhi, Opp Aksharwadi, Bhavnagar");
        System.out.println(address);
        address.append(" Gujarat"); //it will add new value at the end of string
        address.append(" India"); //it will add new value at the end of string
        System.out.println(address);
        address.insert(0,"The EasyLearn Academy "); //it will add enw string at the begining of string
        address.append(100);
        address.append(3.14f);
        address.append(true);

        address.insert(0,500);
        address.insert(0,11.25f);
        address.insert(0,true);
        System.out.println(address);
    }
}