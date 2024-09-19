package Hard_problems.Regular_Expression_Matching_10;

import java.util.regex.*;

public class Sol {
    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
    }

    /*Using java library */
    public static boolean isMatch(String s, String p){
        return Pattern.compile(p).matcher(s).matches();
    }
}
