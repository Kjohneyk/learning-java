import java.util.HashMap;
import java.util.Iterator;

public class User {

    public static double getAverageOfOdd(HashMap<Integer, Integer> hm) {

        int count = 0;
        int sumOfOdd = 0;
        Iterator<Integer> itr = hm.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            if (key%2 != 0) {
                sumOfOdd += hm.get(key);
                count++;
            }
        }
        int avg = sumOfOdd/count;
        return avg;
    }

}
