import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        System.out.println("enter array size and elements");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            al1.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            al2.add(sc.nextInt());
        }

       
        ArrayList<Integer> al3 = new ArrayList<Integer>();

        al3 = User.generateOddEvenList(al1,al2);
        for (Integer s : al3) {
            System.out.print(s + " ");
        }

        
    }
}
