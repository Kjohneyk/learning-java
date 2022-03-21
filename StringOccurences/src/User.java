import java.util.StringTokenizer;

public class User {

    public static int countNoOfWords(String s1, String s2) {
        
        String ss1[] = s1.split(" ");
        String ss2[] = s2.split(" ");
        
        int count = 0;
        for (int i = 0; i < ss1.length; i++) {
            if (ss1[i].equals(ss2[1])) {
                count++;
            }
        }

        return count;
    }
}
