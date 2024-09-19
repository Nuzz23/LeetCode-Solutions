package Easy_problems.PlusOne_66;

public class Sol {
    public static void main(String[] args) {
        for(int v : plusOne(new int[]{9}))
        System.out.print(v+ " ");
    }

    public static int[] plusOne(int digits[]){
        int x [] = new int[digits.length], borrow=1;

        for(int i=digits.length-1; i >= 0; i--){
            x[i] = (digits[i]+borrow) % 10;
            borrow = (digits[i]+borrow) / 10;
        }

        if(borrow != 0){
            int x2[] = new int[x.length+1];
            x2[0]=borrow;
            for(int i = 0; i < x.length; i++)
                x2[i+1]=x[i];
            return x2;
        }

        return x;
    }
}
