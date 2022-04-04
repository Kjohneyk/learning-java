

public class User {

    public static String swapPairs(String txt) {
        char []sw = new char[txt.length()];
        for (int i = 0; i < sw.length; i += 2) {
            int nxt = i + 1;
            sw[i] = txt.charAt(nxt);
            sw[nxt] = txt.charAt(i);
        }
        return String.valueOf(sw);
    }

}
