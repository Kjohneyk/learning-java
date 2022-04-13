import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date Of Birth: ");
        String dob = sc.next();
        sc.close();

        long age = User.getAge(dob);
        System.out.println("age " +age);
        System.out.println( age > 18 ? "Eligible" : "Not-Eligible");
    }
}
