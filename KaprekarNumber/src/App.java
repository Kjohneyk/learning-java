import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number ");
        int n = sc.nextInt();

        System.out.println(User.getKaprekarNumber(n) == 1 ? "Kaprekar Number" : "Not A Kaprekar Number");
    }
}
