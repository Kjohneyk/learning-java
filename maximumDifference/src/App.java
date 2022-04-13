import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Hello, World!");      
        int n = sc.nextInt();
      

        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        System.out.println(User.findMaxDistance(arr));
    }
}
