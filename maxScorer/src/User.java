import java.util.ArrayList;

public class User {

    public static String highestScorer(ArrayList<String> al) {
        String hs = "";
        int max = 0;
        for (int i = 0; i < al.size(); i++) {
            String []stud = al.get(i).split("-");
            int sum = 0;
            for (int j = 1; j < stud.length; j++) {
                sum += Integer.parseInt(stud[j]);
            }
        
            if (sum > max) {
                max = sum;
                hs = stud[0];
            }
        }
        return hs;
    }

}
