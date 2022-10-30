package start.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('n', 0);
        map.put('s', 0);
        map.put('e', 0);
        map.put('w', 0);

        for (char ch : walk) {
            if (map.containsKey(ch)) {
                int key = map.get(ch);
                map.put(ch, key + 1);
            }
        }

        if (Objects.equals(map.get('n'), map.get('s')) && map.get('n') != 0 && map.get('e') == 0 && map.get('w') == 0) {
            return true;
        } else if (Objects.equals(map.get('w'), map.get('e')) && map.get('w') != 0 && map.get('s') == 0 && map.get('n') == 0) {
            return true;
        } else if (Objects.equals(map.get('n'), map.get('s')) && Objects.equals(map.get('w'), map.get('e'))) {
            return true;
        }

        return false;
    }
}
