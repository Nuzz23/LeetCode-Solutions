package Easy_problems.SingleNumber;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

public class Sol {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354}));
    }

    /*With java streams, too slow and O(N) space */
    public static int singleNumberWithStreams(int nums[]){
        LinkedList<Integer> s = new LinkedList<>();
        for(int v: nums)
            s.add(v);

        return s.stream().parallel().distinct().collect(
            Collectors.groupingBy(t->s.stream().filter(p->t.equals(p)).count())
            ).get(Long.valueOf(1)).get(0);
    }

    public static int singleNumber(int []nums){
        Set<Integer> x = new HashSet<>();

        for(int v : nums)
            if(x.contains(v))
                x.remove(v);
            else
                x.add(v);

        for(int v: x)
            return v;    
        return 0;
    }

}
