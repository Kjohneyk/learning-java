

public class User {

    public static String getMaxVowels(String s1) {
        String ss1[] = s1.split(" ");

        int count = 0;
        int max = 0;
        String result = null;

        for (int i = 0; i < ss1.length; i++) {
            count = 0;
            if ((ss1[i].charAt(i)+"").matches("[aeiouAEIOU]{1}")) {
                count++;
            }
            if (count > max) {
                max = count;
                result = ss1[i];
            }
        }
        return result;
    }

   

}
