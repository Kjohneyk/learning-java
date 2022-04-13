import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class User {

    public static long getAge(String dob) throws ParseException {
        long age= 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = "01/01/2015";
             
        Date currDate = sdf.parse(currentDate);
        Date dob1 = sdf.parse(dob);
        Calendar c = Calendar.getInstance();
        c.setTime(dob1);  
        int dobY = c.get(Calendar.YEAR);
        c.setTime(currDate);
        int curY = c.get(Calendar.YEAR);
        age = Math.abs(dobY - curY);
        return age;
    }

}
