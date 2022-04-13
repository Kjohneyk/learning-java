import java.util.HashMap;
import java.util.Iterator;

public class User {

    public static String getMaxKeyValue(HashMap<Integer, String> hm) {
        Iterator<Integer> itr = hm.keySet().iterator();
        int maxKey = 0;
        String value = "";
        while (itr.hasNext()) {
            int key = itr.next();
            if (key > maxKey) {
                maxKey = key;
                value = hm.get(key);
            }
            
        }
        return value;
    }

}
