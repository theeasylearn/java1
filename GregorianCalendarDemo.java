import java.util.Calendar;
import java.util.GregorianCalendar;
public class GregorianCalendarDemo
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        GregorianCalendar gc1 = new GregorianCalendar();
        int day = gc1.get(Calendar.DAY_OF_MONTH);
        int month = gc1.get(Calendar.MONTH) + 1;
        int year = gc1.get(Calendar.YEAR);
        int hour = gc1.get(Calendar.HOUR);
        int minute = gc1.get(Calendar.MINUTE);
        int second = gc1.get(Calendar.SECOND);

        String CurrentDate = day + "/" + month + "/" + year;
        String CurrentTime = hour + ":" + minute + ":" + second;
        
        p(CurrentDate);
        p(CurrentTime);
        
    }
}