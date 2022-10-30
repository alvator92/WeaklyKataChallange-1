package start.solution;

public class FindOdd {
    public static int findIt(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            int odd = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    odd++;
                }
            }
            if (odd % 2 != 0) {
                return a[i];
            }
        }

        return -1;
    }
}
