import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.print("enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee "+(i+1)+" details");
            System.out.print("Firstname ");
            String firstname = sc.nextLine();
            System.out.print("Lastname ");
            String lastname = sc.nextLine();
            System.out.print("Mobile number ");
            String mobile = sc.nextLine();
            System.out.print("E-mail ");
            String email = sc.nextLine();
            employees.add(new Employee(firstname, lastname, mobile, email));

        }
        sc.close();
        System.out.println("=================Employee List==================");
        System.out.format("%-15s %-15s %-15s %-30s\n",
        "Firstame","Lastname","Mobile Number","E-mail");
        employees.forEach(System.out::println);
    }
}
