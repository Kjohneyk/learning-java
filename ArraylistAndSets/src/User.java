import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class User {

    public static ArrayList<Integer> performSetOperations(ArrayList<Integer> al1, ArrayList<Integer> al2, char op) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Set<Integer> st1 = new LinkedHashSet<>();
        for (int i = 0; i < al1.size(); i++) {
            st1.add(al1.get(i));
        }
        Set<Integer> st2 = new LinkedHashSet<>();
        for (int i = 0; i < al2.size(); i++) {
            st2.add(al2.get(i));
        }

        if (op == '+') {
            st1.addAll(al2);
            result.addAll(st1);
        } else if (op == '*') {
            st1.retainAll(st2);
            result.addAll(st1);
        } else if (op == '-') {
            st1.removeAll(st2);
            result.addAll(st1);
        }
        return result;
    }

}
