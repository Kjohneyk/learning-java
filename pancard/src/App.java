import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PAN no. ");
        String txt = sc.next();
        sc.close();
        int res = User.validatePAN(txt);
        System.out.println(res == 1 ? "Valid" : "Invalid");
    }
}
