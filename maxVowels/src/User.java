

public class User {

    public static String getWordWithMaximumVowels(String txt) {
        String wrd[] = txt.split(" ");
        String maxVowels = "";
        int count;
        int max = 0;
        for (int i = 0; i < wrd.length; i++) {
            count = 0;
            for (int j = 0; j < wrd[i].length(); j++) {
                if ((wrd[i].charAt(j)+"").matches("[aeiouAEIOU]{1}")) {
                    count++;
                }
                if (count > max) {
                    maxVowels = wrd[i];
                    max = count;
                }
            }


           
        }
        return maxVowels;
    }

}
