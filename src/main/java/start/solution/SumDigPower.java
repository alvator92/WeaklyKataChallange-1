package start.solution;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> list = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        for (long i = a; i < b; i++) {
            strings.add(i + "");
        }

        for (String string : strings) {
            char[] characters = string.toCharArray();
            int[] ints = new int[characters.length];
            for (int i = 0; i < characters.length; i++) {
                ints[i] = Integer.parseInt(String.valueOf(characters[i]));
            }
            int sum = 0;
            for (int i = 0; i < ints.length; i++) {
                sum += Math.pow(ints[i], i + 1);
            }
            if ((sum + "").equals(string)) {
                list.add(Long.parseLong(string));
            }
        }
        return list;
    }
}
