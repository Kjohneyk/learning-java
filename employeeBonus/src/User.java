import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class User {

    public static TreeMap<Integer, Integer> calculateRevisedSalary(HashMap<Integer, String> hm1, HashMap<Integer, Integer> hm2) throws ParseException {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        Iterator<Integer> itr = hm1.keySet().iterator();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dt1 = sdf.parse("01-09-2014");

        while (itr.hasNext()) {
            int key = itr.next();
            String dob = hm1.get(key);
            int salary = hm2.get(key);
            Date dt2 = sdf.parse(dob);

            Calendar cl = Calendar.getInstance();
            cl.setTime(dt1);

            int y1 = cl.get(Calendar.YEAR);
            cl.setTime(dt2);
            int y2 = cl.get(Calendar.YEAR);

            int age = Math.abs(y1 - y2);

            int new_sal = 0;
            if (age >= 25 && age <= 30) {
                new_sal = (int) (salary + salary * 0.2);
                tm.put(key, new_sal);
            }else if (age >= 31 && age <= 60) {
                new_sal = (int)(salary + salary * 0.3);
                tm.put(key, new_sal);
            }

        }




        return tm;
    }

}
