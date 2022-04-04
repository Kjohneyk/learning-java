import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        String pwd = sc.next();
        boolean flag =  User.validatePassword(pwd);
        System.out.println(flag == true ? "Valid" : "Invalid");
    }

    
}
