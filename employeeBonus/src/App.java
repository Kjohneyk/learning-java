import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        TreeMap<Integer,Integer> tm = new TreeMap<>();

        System.out.println("enter details");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            hm1.put(id, sc.next());
            hm2.put(id, sc.nextInt());
        }

        tm = User.calculateRevisedSalary(hm1,hm2);

        Iterator<Integer> itr = tm.keySet().iterator();
        while (itr.hasNext()) {
            int id = itr.next();
            System.out.println(id +"\n" + tm.get(id));
            
        }

        sc.close();


    }
}
