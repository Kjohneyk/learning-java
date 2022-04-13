import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Enter ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            hm.put(sc.nextInt(),sc.next());
        }
        sc.close();

        al = User.getName(hm);
        System.out.println("output:");
        al.forEach(System.out::println);


    }
}
