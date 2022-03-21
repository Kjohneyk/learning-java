import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        Scanner sn = new Scanner(System.in);
        String string1, string2, stringPlus;

        System.out.print("Enter first string: ");
        string1 = sn.nextLine();

        System.out.print("Enter second string: ");
        string2 = sn.nextLine();

        stringPlus = UserMainCode.replacePlus(string1,string2);

        System.out.println(stringPlus);
    }
}
