import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Date: ");
        String date = sc.next();
        sc.close();
        String res = User.convertDateFormat(date);
        System.out.println(res);
    }
}
