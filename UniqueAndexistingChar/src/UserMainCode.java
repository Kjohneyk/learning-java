public class UserMainCode {

    public static String replacePlus(String string1, String string2) {

        String s1 = string1.toUpperCase();
        String s2 = string2.toUpperCase();

        char modString[] = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {                    
                    modString[i] = string1.charAt(i);
                    break;
                }
                modString[i] = '+';
                                
            }
            
        }


        return new String(modString);
    }   
    
}
