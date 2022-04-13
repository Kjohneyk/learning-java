import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class User {

    public static String convertDateFormat(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yy");
        Date dte = sdf.parse(date);
        String txt = sdf1.format(dte);
        return txt;
    }

}
