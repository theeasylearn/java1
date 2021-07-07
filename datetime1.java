import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class datetime1
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        LocalDate d1= LocalDate.now(); //Obtains the current date from the system clock in the default time-zone.
        
        int day = d1.getDayOfMonth(); //return day of month
        int year = d1.getYear(); //year of the date 
        int month = d1.getMonthValue(); //return month of the date

        String CurrentDate = day + "/" + month + "/" + year;
        String USCurrentDate = month + "/" + day + "/" + year;
        p("Indian format " + CurrentDate);
        p("US format " + USCurrentDate);


        LocalTime t1 = LocalTime.now();

        int hour = t1.getHour();
        int minute = t1.getMinute();
        int second = t1.getSecond();

        String CurrentTime = hour + ":" + minute + ":" + second;
        p("Current Time " + CurrentTime);

        LocalDateTime dt1 = LocalDateTime.now();
        day = dt1.getDayOfMonth(); //return day of month
        year = dt1.getYear(); //year of the date 
        month = dt1.getMonthValue(); //return month of the date
        hour = dt1.getHour();
        minute = dt1.getMinute();
        second = dt1.getSecond();

        String CurrentDateTime = hour + ":" + minute + ":" + second + " " + day + "/" + month + 
        "/" + year;

        p(CurrentDateTime);

    }
}