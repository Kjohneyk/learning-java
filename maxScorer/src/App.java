import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        System.out.print("Enter number of students ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            al.add(sc.next());
        }

        System.out.println(User.highestScorer(al));

    }
}
