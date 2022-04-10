

public class User {

    public static String getLastLetter(String txt) {
        // String ss[] = txt.toUpperCase().split(" ");
        // StringBuffer res = new StringBuffer();
        // for (int i = 0; i < ss.length; i++) {
        //     res.append('$');
        //     for (int j = 0; j < ss[i].length(); j++) {
        //        if (j == ss[i].length() - 1) {
        //            res.append(ss[i].charAt(j));
        //        }   
        //     }
            
        // }
        // return res.toString();

        String []ss = txt.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ss.length; i++) {
            sb.append(Character.toUpperCase(ss[i].charAt(ss[i].length()-1))).append("$");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }

}
