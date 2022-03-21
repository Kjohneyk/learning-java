import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size and elements: ");

        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int evenSum = User.addUniqueEven(arr);
        System.out.println(evenSum == -1 ? "No even numbers" : evenSum);
    }
}
