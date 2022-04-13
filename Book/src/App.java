import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<Author> authors = new ArrayList<>();

        System.out.print("Enter the Book name ");
        String bookName = sc.nextLine();

        System.out.print("Enter number of authors ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter author name ");
            String authorName = sc.nextLine();
            System.out.print("Enter author email ");
            String email = sc.nextLine();
            System.out.print("Enter author gender ");
            String gender = sc.nextLine();

            authors.add(new Author(authorName,email,gender));
        }
        System.out.print("Enter book price ");
        double bookPrice = sc.nextDouble();

        System.out.println("is the book currently available? Type \"Yes\"/\"No\" (Not case sensitive)");
        String ans = sc.next();
        if (ans.equalsIgnoreCase("yes")) {
            System.out.print("Enter the number of books available");
            int numInStock = sc.nextInt();
            Book book = new Book(bookName,authors,bookPrice,numInStock);
            System.out.println(book);
        } else {
            Book book = new Book(bookName,authors,bookPrice);
            System.out.println(book);
        }
        sc.close();
    }
}
