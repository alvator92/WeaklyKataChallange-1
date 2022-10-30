package start.solution;

import java.util.Locale;

public class isorgam {
    public static boolean  isIsogram(String str) {
        if (str.length()==0) {
            return true;
        }
        str = str.toLowerCase(Locale.ROOT);
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i ++) {
            int num = 0;
            for (char ch : chars) {
                if (str.charAt(i) == ch) {
                    num ++;
                }
                if (num > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

