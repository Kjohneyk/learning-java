

public class User {

    public static int getKaprekarNumber(int n) {
        String a = Integer.toString(n * n);
        int n1 = Integer.parseInt(a.substring(0, a.length()/2));
        int n2 = Integer.parseInt(a.substring(a.length()/2));

        int n3 = n1 + n2;
        if (n == n3) {
            return 1;
        } else {
            return -1;
        }

    }

}
