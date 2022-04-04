

public class User {

    public static boolean validatePassword(String pwd) {
        int num = 0;
        int ch = 0;
        int alph = 0;
        boolean flag = false;
        if (pwd.length() >= 8) {
            for (int i = 0; i < pwd.length(); i++) {
                if (Character.isDigit(pwd.charAt(i))) {
                    num++;
                }
               if(Character.isLetter(pwd.charAt(i))){
                    alph++;
                }else if( !(Character.isDigit(pwd.charAt(i))) && !(Character.isLetter(pwd.charAt(i))) && (pwd.charAt(i) != ' ')){
                    ch++;
                }
            }

            if ((num >= 1) && (ch >= 1) && (alph >= 1)) {
                flag = true;
            }


            
        }

        return flag;
    }

}
