import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text ");
        String txt =  sc.nextLine();
        sc.close();
        String xx = User.getLastLetter(txt);
        System.out.println(xx);

    }
}
