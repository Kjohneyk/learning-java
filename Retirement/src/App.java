import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        HashMap<String,String> hm = new HashMap<String,String>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            hm.put(sc.next(), sc.next());
        }

       
       System.out.println(User.retirementEmployeeList(hm));

    }
}
