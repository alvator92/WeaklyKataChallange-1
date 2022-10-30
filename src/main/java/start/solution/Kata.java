package start.solution;

public class Kata {
    public static String reverseWords(final String original) {
        String[] arr = original.split(" ");
        if(arr.length == 0) {
            return original;
        }
        String result = "";
        for(String word : arr) {
            StringBuilder input = new StringBuilder();
            result += input.append(word).reverse() + " ";
        }
        return result.trim();
    }
}
