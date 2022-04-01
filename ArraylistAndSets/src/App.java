import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        ArrayList<Integer> al3 = new ArrayList<Integer>();

        System.out.println("Enter values");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            al1.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            al2.add(sc.nextInt());
        }
        char op = sc.next().charAt(0);

        al3 = User.performSetOperations(al1,al2,op);

        al3.forEach(num -> System.out.println(num));
    }
}
