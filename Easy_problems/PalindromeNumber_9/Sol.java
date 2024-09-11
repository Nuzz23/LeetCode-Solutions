package Easy_problems.PalindromeNumber_9;

import java.util.Stack;

public class Sol {
    public static void main(String[] args) {
        System.out.println(isPalindromeWithString(1021));
    }

    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
    
        Stack<Integer> s = new Stack<>();
        int x2 = x;

        while(x2 != 0){
            s.push(x2%10);
            x2=x2/10;
        }

        while(!s.empty()){
            if(x % 10 != s.pop())
                return false;
            x = x/10;
        }
        
        return true;
    }

    public static boolean isPalindromeWithString(int x){
        char s [] = Integer.toString(x).toCharArray();
        for(int i = 0; i < s.length/2; i++)
            if(s[i] != s[s.length-i-1])
                return false;
        return true;
    }

    /*Not working well */
    public static boolean isPalindromeWithLogs(int x){
        if(x<0)
            return false;
        if(x<10)
            return true;

        int z,w;
        while(x!=0){
            w = Double.valueOf(Math.pow(10, Double.valueOf(Math.log10(x)).intValue())).intValue();
            if((z = x / w) != x %10)
                return false;
            x = (x -z * w)/10;
        }

        return true;
    }

    public static boolean isPalindromeWithInversion(int x){
        int rev=0;
        int t=x;
        while(x>0){
            rev=rev*10+x%10;
            x=x/10;
        }
        return rev==t;
    }
}
