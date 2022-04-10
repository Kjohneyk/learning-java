

public class User {

    public static int validatePAN(String txt) {
        if (txt.length() == 8) {
           if (txt.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}")) {
               return 1;
           }else{
               return 2;
           }
        } else {
            return 2;
        }
       
    }

}
