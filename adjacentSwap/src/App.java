import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String txt = sc.nextLine();
        System.out.println(User.swapPairs(txt));
    }
}
