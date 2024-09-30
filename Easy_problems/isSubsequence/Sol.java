public class Sol{
    public static void main(String[] args) {
        System.err.println(isSubsequence("abc", "aeblc"));
    }
    public static boolean isSubsequence(String s, String t) {
        char [] sub = s.toCharArray(), str = t.toCharArray();
        if(sub.length==0)
            return true;
            
        int j = 0;
        for(int i=0; i<str.length;i++)
            if(sub[j] == str[i]){
                j++;
                if (j == sub.length)
                    break;
            }


        return j == sub.length;
    }
}