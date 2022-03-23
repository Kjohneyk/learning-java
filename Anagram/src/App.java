import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two string");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(User.getAnagram(s1,s2) == 1 ? "Anagrams" : "Not anagrams");

    }
}
