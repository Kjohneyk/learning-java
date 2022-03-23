import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class User {

    public static ArrayList<String> retirementEmployeeList(HashMap<String, String> hm) throws ParseException {

        ArrayList<String> al = new ArrayList<String>();
        Iterator<String> itr = hm.keySet().iterator();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String s = "01/01/2014";
        Date d1 = new Date();
        Date d2 = sdf.parse(s);

        while (itr.hasNext()) {
            String key = itr.next();
            String val = hm.get(key);
            d1 = sdf.parse(val);

            Calendar c = Calendar.getInstance();

            c.setTime(d1);

            int y1 = c.get(Calendar.YEAR);
            int m1 = c.get(Calendar.MONTH);
            int day1 = c.get(Calendar.DAY_OF_MONTH);

            c.setTime(d2);

            int y2 = c.get(Calendar.YEAR);
            int m2 = c.get(Calendar.MONTH);
            int day2 = c.get(Calendar.DAY_OF_MONTH);

            int y = Math.abs(y1 - y2);

            if (m1 == m2) {
                if(day2 > day1)
                y--;
            }else if(m1>m2){
                y--;
            }

            if (y >= 60) {
                al.add(key);
            }

        }
        return al;
    }

}
