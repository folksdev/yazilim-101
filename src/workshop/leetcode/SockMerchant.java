package workshop.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMerchant {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Long> countMap = ar.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        System.out.println(countMap);
        List<Integer> pairs = countMap.values().stream().filter(x -> x >= 2).map(x -> x.intValue() / 2).collect(Collectors.toList());
        System.out.println(pairs);
        return pairs.stream().reduce(0, Integer::sum);

    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(20, Arrays.asList(4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5)));
    }
}
