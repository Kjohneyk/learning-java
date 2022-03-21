import java.util.StringTokenizer;

public class User {

    public static int countNoOfWords(String s1, String s2) {
        int count = 0;
        String ss1[] = s1.split(" ");
        String ss2[] = s2.split(" ");

        for (int i = 0; i < ss1.length; i++) {
            if (ss1[i].equals(ss2[1])) {
                count++;
            }
        }

        return count;
    }

    public static int countNoOfWords1(String s1, String s2) {
        StringTokenizer ss1 = new StringTokenizer(s1, " ");
        StringTokenizer ss2 = new StringTokenizer(s2, " ");

        int count = 0;
        while (ss1.hasMoreTokens()) {
            String
            if (condition) {
                
            }
        }
        return 1;
    }
}
