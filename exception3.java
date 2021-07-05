public class exception3
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    //java exception 10 20 30 40 50 
    //                  0  1  2 3  4
    //java exception 10 20 car 40 true
    public static void main(String arguments[])
    {
       int size = arguments.length;
       if(size==0)
       {
           p("please give value when you run program...");
       }
       else 
       {
           int position=0,count=0;
           float sum=0,average;
           while(position<size)
           {
               try
               {
                   sum= sum + Float.parseFloat(arguments[position]);
                   count++;
               }
               catch(NumberFormatException error)
               {
                   p(arguments[position] + " is invalid value so it is skiped");
               }
               position++;
           }
           p("sum = " + sum);
           if(count!=0)
           {
               average = sum/count;
               p("average = " + average);
           }
       } 
    }
}