import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product id: ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter product name: ");
        String prodName = sc.nextLine();
        System.out.println("Is the product supplied by Nivas Suppliers ? Type \"yes\" or \"no\" (not case sensitive)");
        String ans = sc.next();
        if (ans.equalsIgnoreCase("no")) {
            System.out.print("Enter supplier name ");
            String suppName = sc.next();
            Product prod = new Product(id,prodName,suppName);
            prod.display();
        }else{
            Product prod = new Product(id,prodName);
            prod.display();
        }
        sc.close();
    }   
}
