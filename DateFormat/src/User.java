import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class User {

    public static String findOldDate(String date1, String date2) throws ParseException {
        String oldDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        Date dt1 = sdf.parse(date1);
        Date dt2 = sdf.parse(date2);

        c.setTime(dt1);
        int day1 = c.get(Calendar.DAY_OF_WEEK);
        int mnth1 = c.get(Calendar.MONTH);
        int year1 = c.get(Calendar.YEAR);

        c.setTime(dt2);
        int day2 = c.get(Calendar.DAY_OF_WEEK);
        int mnth2 = c.get(Calendar.MONTH);
        int year2 = c.get(Calendar.YEAR);

        if (year1 == year2) {
            if (mnth1 == mnth2) {
                if (day1 == day2) {
                    oldDate = sdf2.format(dt1);
                }else if (day1 > day2) {
                    oldDate = sdf2.format(dt2);
                }else{
                    oldDate = sdf2.format(dt1);
                }
            }else if (mnth1 > mnth2) {
                oldDate = sdf2.format(dt2);
            }else{
                oldDate = sdf2.format(dt1);
            }
        }else if (year1 > year2) {
            oldDate = sdf2.format(dt2);
        }else{
            oldDate = sdf2.format(dt1);
        }



        return oldDate;
    }

}
