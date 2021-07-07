import java.util.Calendar;
import java.util.Scanner;
public class CalendarDemo
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        String CurrentDate = day + "/" + month + "/" + year;
        String CurrentTime = hour + ":" + minute + ":" + second;
        
        p(CurrentDate);
        p(CurrentTime);

        Scanner input = new Scanner(System.in);
        p("Enter day you want to add in Current Date");
        int DaysToAdd = input.nextInt();
        calendar.add(Calendar.DAY_OF_MONTH,DaysToAdd);

        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH) + 1;
        year = calendar.get(Calendar.YEAR);
        
        CurrentDate = day + "/" + month + "/" + year;
        
        p(CurrentDate);
        
    }
}