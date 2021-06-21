package workshop.leetcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContastIntersection {
    /**
     * A multiset or a bag is a collection of elements that can be repeated. Contrast with a set,
     * where elements cannot be repeated.
     * Multisets can be intersected just like sets can be intersected.
     * <p>
     * Input :
     * <p>
     * A = [0,1,1,2,2,5]
     * B = [0,1,2,2,2,6]
     * <p>
     * Output :
     * A ∩ B = C = [0,1,2,2]
     * <p>
     * Input :
     * A = [0,1,1]
     * B = [0,1,2,3,4,5,6]
     * <p>
     * Output
     * A ∩ B = C = [0,1]
     * <p>
     * Write a function to find the intersection of two integer arrays in that way ?
     */
    public static List<Integer> solution2(int[] a, int[] b) {
        Map<Integer, Long> counters = Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(p -> p,
                        Collectors.counting()));
        List<Integer> result = new ArrayList<>();
        for (int i: b){
            if (counters.containsKey(i) && counters.get(i) > 0){
                result.add(i);
                counters.put(i, counters.get(i) - 1);
            }
        }
        return result;
    }

    public static List<Integer> solution(int[] a, int[] b) {
        Queue<Integer> counters = Arrays.stream(a)
                .boxed().collect(Collectors.toCollection(LinkedList::new));



        List<Integer> result = new ArrayList<>();
        for (int i: b){
            if (counters.peek() == null){
                break;
            }
            if (counters.poll() == i){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,3,3,4,5,5,6,6};
        int[] b = {2,3,3,3,3,4,5,6};
        System.out.println(solution(a,b));



        /*List<Integer> aList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> bList = aList.stream()
                                   .filter(x -> x % 2 == 0)
                                   .collect(Collectors.toList());*/

        //Result:
        // aList[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // bList[2, 4, 6, 8, 10]

        //System.out.println(getMinSquares(99));




        /*List<List<String>> aList = Arrays.asList(
                Arrays.asList("Square", "Triangle", "Circle"),
                Arrays.asList("Hello","FolsDev"));

        List<Integer> bList = aList.stream()
                                   .flatMap(x -> x.stream().map(String::length))
                                   .collect(Collectors.toList());*/

        //Result:
        // aList[ [Square, Triangle, Circle] , [Hello, Folksdev] ]
        // bList[6, 8, 6, 5, 7]

       /* List<Integer> aList = Arrays.asList(1, 2, 3);
        aList.stream().forEach(x -> System.out.println(x * 2 + " "));
        //OR
        aList.forEach(x -> System.out.println(x * 2 + " "));*/

        //Output
        // 2, 4, 6


        List<List<String>> aList = Arrays.asList(
                Arrays.asList("Square", "Triangle", "Circle"),
                Arrays.asList("Hello","FolsDev"));

        aList.stream()
                .flatMap(x -> x.stream().map(String::length))
                .map(x -> x * 2)
                .filter(y -> y < 10)
                .forEach(System.out::println);


    }


    /**
     * Given number N, Find the least number of perfect square number sum needed to get N.
     *
     * Example :
     * n=5 (4+1) i.e. 2
     * n=7 (4+1+1+1) i.e. 4
     * n=12 (4+4+4) i.e 3
     * n=20 (16+4) i.e. 2
     *
     */
    static int getMinSquares(int n)
    {

        // We need to add a check
        // here for n. If user enters
        // 0 or 1 or 2
        // the below array creation
        // will go OutOfBounds.
        if (n <= 3)
            return n;

        // Create a dynamic programming
        // table
        // to store sq
        int dp[] = new int[n + 1];

        // getMinSquares table for
        // base case entries
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        // getMinSquares rest of the
        // table using recursive
        // formula
        for (int i = 4; i <= n; i++)
        {

            // max value is i as i can
            // always be represented
            // as 1*1 + 1*1 + ...
            dp[i] = i;

            // Go through all smaller numbers to
            // to recursively find minimum
            for (int x = 1; x <= Math.ceil(
                    Math.sqrt(i)); x++)
            {
                System.out.print(x + " =");
                int temp = x * x;
                if (temp > i) {
                    System.out.println();
                    break;
                }
                else {
                    System.out.println("i:" + i + " temp: " + temp + " " + dp[i] + " -> " + dp[i - temp]);
                    dp[i] = Math.min(dp[i], 1 + dp[(i - temp)]);
                }
            }
        }

        // Store result and free dp[]
        //Arrays.stream(dp).forEach(System.out::println);
        return dp[n];
    }
}
