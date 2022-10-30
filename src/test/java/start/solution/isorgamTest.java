package start.solution;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class isorgamTest {

    static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();
    public String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }
    @Test
    public void FixedTests() {
        assertEquals(true, isorgam.isIsogram("Dermatoglyphics"));
        assertEquals(true, isorgam.isIsogram("isogram"));
        assertEquals(false, isorgam.isIsogram("moose"));
        assertEquals(false, isorgam.isIsogram("isIsogram"));
        assertEquals(false, isorgam.isIsogram("aba"));
        assertEquals(false, isorgam.isIsogram("moOse"));
        assertEquals(true, isorgam.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isorgam.isIsogram(""));
    }
    private static boolean A(String str) {
        str = str.toLowerCase();
        int len = str.length();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
    @Test
    public void RandomTests() {
        for(int i = 0; i < 101;) {
            String Z = randomString(++i * 10);
            assertEquals(A(Z), isorgam.isIsogram(Z));
        }
    }
}