import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> hm1 = new HashMap<Integer,Integer>();

        System.out.println("Enter hash size and key/value pairs");

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            hm1.put(sc.nextInt(), sc.nextInt());
        }

        System.out.println(User.getAverageOfOdd(hm1));

    }
}
