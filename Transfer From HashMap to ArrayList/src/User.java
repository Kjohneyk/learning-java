import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class User {

    public static ArrayList<String> getName(HashMap<Integer, String> hm) {
        ArrayList<String> al = new ArrayList<>();
        Iterator<Integer> itr = hm.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            String val = hm.get(key);
            if(val.matches("[a-z]{1}.*[0-9]{1,}.*[A-Z]{1}")){
                al.add(val);
            }
        }
        return al;
    }

}
