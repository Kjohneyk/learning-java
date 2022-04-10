import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter two dates in dd-MM-yyyy");
        String date1 = sc.next();
        String date2 =  sc.next();

        System.out.println(User.findOldDate(date1, date2));
    }
}
