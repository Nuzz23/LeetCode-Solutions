public class Sol {
    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[]{-1, 2, 1}));
    }

    public static int findClosestNumber(int[] nums) {
        int curr = Integer.MAX_VALUE;

        for(int num : nums)
            if (Math.abs(num) < Math.abs(curr) || (Math.abs(num) == Math.abs(curr) && num > curr))
                curr = num;

        return curr;
    }
}