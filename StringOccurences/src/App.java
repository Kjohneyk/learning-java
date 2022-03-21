import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first sentence");
        String s1 = sc.nextLine();
        System.out.println("enter second sentence");
        String s2 = sc.nextLine();

        int result = User.countNoOfWords(s1,s2);

        System.out.println(result);
    }
}
