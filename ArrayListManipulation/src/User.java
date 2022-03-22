import java.util.ArrayList;

public class User {

    public static ArrayList<Integer> generateOddEvenList(ArrayList<Integer> al1, ArrayList<Integer> al2) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < al1.size(); i++) {
            if (i%2 == 0) {
                al.add(al2.get(i));
            }else{
                al.add(al1.get(i));
            }
        }

        return al;
    }

}
