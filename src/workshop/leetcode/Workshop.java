package workshop.leetcode;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.Math;
import java.util.stream.Stream;

public class Workshop {

    /**
     * Geekle Java Case Study Summit
     * 02.02.2021
     * Java Code examples
     * @param args
     */

    /**
     * You have three Arrays.
     * A = {2, 5, 3, 2, 8, 1}
     * B = {7, 9, 5, 2, 4, 10, 10}
     * C = {6, 7, 5, 5, 3, 7}
     *
     * s1 = A & B - 2, 5, 3, 8, 1, 7, 9, 4, 10
     * s2 = A & C -
     * s3 = B & C
     *  2, 5, 3, 8, 1, 7, 9, 4, 10
     * result = s(s1 + s2 + s3)
     *
     * make an array from this three arrays which elements is present in at least two array.
     *
     * This question was followed by instead of three arrays. If you have a list of array then what will be the solution?
     * Also what will be the time complexity?
     * 3xO(n)
     * recursive - log n
     * n
     * 1
     * 2 * n
     * n * n * n * n
     * @param
     */

    public static void presentTwoElements(int[] A, int[] B, int[] C){
        HashSet<Integer> AA = (HashSet<Integer>) Arrays.stream(A).boxed().collect(Collectors.toSet()); //n
        HashSet<Integer> BB = (HashSet<Integer>) Arrays.stream(B).boxed().collect(Collectors.toSet()); //n
        HashSet<Integer> CC = (HashSet<Integer>) Arrays.stream(C).boxed().collect(Collectors.toSet()); //n
        //3n
        //n + 2n + 2n + 2n + n = 9n
        //9n + 3n = 12n = O(n)
        Set<Integer> result = Stream.of(AA, BB, CC).flatMap(Collection::stream)  //n
                                            .filter(x -> (AA.contains(x) && BB.contains(x)) || //n * 2
                                                      (AA.contains(x) && CC.contains(x)) ||  // n * 2
                                                      (BB.contains(x) && CC.contains(x)))  // n * 2
                                            .collect(Collectors.toSet()); //n
        System.out.println(result);

    }


    /**
     * Write algorithm for java grep command for word matching in the following context.Given a file containing n words.
     * Given a word w and a number k.Find k words in the file occuring before occurence of w.
     * Assume that the average word size is m in the file
     * eg.
     * 0 aaa
     * 1 bbb
     * 2 ccc
     * 3 booking
     * 4 alpha
     * 5 beta
     * 6 gamma
     *
     * for k=3 and w = booking
     * the output should be [aaa,bbb,ccc,booking]
     * similarly for k =2 and w = beta
     * output should be [booking,alpha,beta]
     * Assume that the file size can grow very large
     * and try to get solution with space complexity lesser than O(n)
     *
     * I suggessted solution for iterating through file until the word w is found and maintaiining a queue of size K
     * The time complexity of my solution was O(nm)
     * and space complexity was O(k) .Any answers to improve the time and space complexity
     * Apparently they were looking for a better implementation of grep
     */

    public static List<String> solve(String[] input, String word, int k) {
        List<String> inputList = Arrays.stream(input).collect(Collectors.toList()); //n
        int wordIndex = inputList.indexOf(word); //n

        if(wordIndex < 0){
            System.out.println(word + " not found");
            return new ArrayList<>();
        }

        if(wordIndex - k < 0){
            return inputList.subList(0, wordIndex + 1); //n
        }


        return inputList.subList(wordIndex - k, wordIndex + 1); //n
        //3xO(n) = n

    }

    /***
     * Given arrays for N (>= 2) users, each representing the IDs of
     * hotels visited,
     * find the common IDs of the hotels visited amongst the users.
     *
     * Input:
     * userA = { 2, 3, 1, 2 }
     * userB = { 2, 5, 3 }
     * userC = { 7, 3, 1 }
     *
     * {2, 3, 1, 2, 5, 3, 7, 3, 1}
     *
     * Output:
     * {3}
     *
     * Assumptions:
     * Arrays are unsorted.
     *
     * Cases:
     * 1) Each array consists of distinct hotel IDs
     * 2) Each array may contain duplicate hotel IDs
     *
     * List<Integer> ref = listOfList.get(0);
     * Set<Integer> hotel;
     * for (int i = 1; i < listOfList.size(); i++) {
     *      hotel = new HashSet<>(listOfList.get(i));
     *      for (int j = 0; j < ref.size(); j++) {
     *          if (!hotel.contains(ref.get(j))) {
     *              ref.remove(j); j--;
     *          }
     *
     *     }
     *  return ref;
     */
    public static List<Integer> findCommonHotelIds(int[][] input){
        List<Set<Integer>> inputList = Arrays.stream(input)
                .map(x -> Arrays.stream(x).boxed().collect(Collectors.toSet()))
                .collect(Collectors.toList()); //n * n

        Map<Integer, Long> counters = inputList.stream() //n
                .flatMap(Collection::stream)//n
                .collect(Collectors.groupingBy(p -> p,
                        Collectors.counting()));

        List<Integer> a = counters.entrySet()
                .stream()
                .filter(x -> x.getValue() >= input.length)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());//n

        //n^2 + 3n = O(n^2) + n

        return a;
    }
    public static List<Integer> developper(int[][] input) {
        List<List<Integer>> listOfList = Arrays.stream(input)
                .map(x -> Arrays.stream(x).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());

        List<Integer> ref = listOfList.get(0);
        Set<Integer> hotel;

        for (int i = 1; i < listOfList.size(); i++) {
            hotel = new HashSet<>(listOfList.get(i));
            for (int j = 0; j < ref.size(); j++) {
                if (!hotel.contains(ref.get(j))) {
                    ref.remove(j);
                    j--;
                }
            }
        }
        return ref;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigDecimal i = BigDecimal.ONE;
        BigDecimal number1 = BigDecimal.ZERO;
        BigDecimal number2 = BigDecimal.ZERO;

        while(l1 != null || l2 != null){
            number1 = (l1 != null) ? number1.add(i.multiply(new BigDecimal(l1.val))) : BigDecimal.ZERO;
            number2 = (l2 != null) ? number2.add(i.multiply(new BigDecimal(l2.val))) : BigDecimal.ZERO;
            i = i.multiply(BigDecimal.TEN);
            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2 != null) ? l2.next : l2;
        }

        System.out.println(number1);
        System.out.println(number2);
        BigDecimal total = number1.add(number2);

        if (total.equals(BigDecimal.ZERO)){
            return new ListNode(0);
        }

        System.out.println(total);
        return getListNode(total);
    }

    public static ListNode getListNode(BigDecimal number){
        if(number.compareTo(BigDecimal.ONE) < 0) {
            return null;
        }

        return new ListNode(number.remainder(BigDecimal.TEN).intValue(),
                getListNode(number.divide(BigDecimal.TEN)));
    }

    public static ListNode addTwoNodes(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int remain = 0;
        while(l1 != null || l2 != null){
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;
            int sum = n1 + n2 + remain;
            remain = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if (remain > 0) {
            current.next = new ListNode(remain);
        }
        return head.next;
    }

    public static void main(String[] args) {
        /**
         * [9] 
         * [1,9,9,9,9,9,9,9,9,9]
         */
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l3 = new ListNode();
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        /*ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                        new ListNode(9, new ListNode(9))))))))));*/
        ListNode result = addTwoNumbers(l1, l2);
        //System.out.println("result: " + result);

        System.out.println();

        int[] A = {2, 5, 3, 2, 8, 1};
        int[] B = {7, 9, 5, 2, 4, 10, 10};
        int[] C = {6, 7, 5, 5, 3, 7};

        //presentTwoElements(A, B, C);

        String[] input = {"aaa",
                "bbb" ,
                "ccc" ,
                "booking" ,
                "alpha" ,
                "beta" ,
                "gamma"};

        //System.out.println(solve(input, "booking", 3));
        //System.out.println(solve(input, "gamma", 3));
        //System.out.println(solve(input, "bbb", 3));

        int[][] hotelIds = {{2, 2, 2}, {2, 5, 6}, {7, 8, 9}};

        //System.out.println(findCommonHotelIds(hotelIds));



        /*
        String text = "MERHABA DÜNYA MERHABA FOLKSDEV";
        int characterCount = text.length();
        int wordCount = text.split(" ").length;

        System.out.println(text);
        System.out.println(wordCounter(text));

        int[] arr = new int[]{1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }


        System.out.println(list);*/
    }

    //(n^2)^1/3 + logn(n^2)
    int mathFunction(int num) {
        int numSquare = num*num;
        return (int) (Math.cbrt(numSquare) +
                Math.log(numSquare));
    }

    public static Map<String, Integer> wordCounter2(String s){
        String[] arr = s.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String word : arr) {
            Integer wordCount = result.get(word);
            if (wordCount != null) {
                result.put(word, wordCount + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }

    public static Map<String, Integer> wordCounter3(String s) {
        StringTokenizer st = new StringTokenizer(s);
        Map<String, Integer> wordCountMap = new HashMap<>();
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            wordCountMap.merge(word, 1, Integer::sum);
        }
        return wordCountMap;
    }

    public static Map<String, Integer> wordCounter(String s){
        return Arrays.stream(s.split("\\s+"))
                .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));
    }


}
