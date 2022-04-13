import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class User {

    public static int getLastDayOfMonth(String date) throws ParseException {
        int days= 0;
        SimpleDateFormat sdf = new  SimpleDateFormat("dd-MM-yyyy");
        Date dte = sdf.parse(date);
        Calendar c = Calendar.getInstance();
        c.setTime(dte);
        days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        return days;
    }

}
