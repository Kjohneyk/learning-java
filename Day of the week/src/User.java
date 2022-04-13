import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class User {

    public static String getDay(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        sdf.setLenient(false);
        Date dte = sdf.parse(date);
       // Calendar c = new GregorianCalendar();
        Calendar c = Calendar.getInstance();
        c.setTime(dte);
      
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEEEE");
        return sdf1.format(c.getTime());

    }
}
