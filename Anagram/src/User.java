
import java.util.Arrays;

public class User {

    public static int getAnagram(String s1, String s2) {
        
        String ss1[] = s1.toLowerCase().split("");
        String ss2[] = s2.toLowerCase().split("");

        for (int i = 0; i < ss1.length; i++) {
            Arrays.sort(ss1);
        }

        for (int i = 0; i < ss2.length; i++) {
            Arrays.sort(ss2);
        }

        if (Arrays.equals(ss1, ss2)) {
            return 1;
        } else {
            return -1;
        }

    }

}
