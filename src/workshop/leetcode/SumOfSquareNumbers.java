package workshop.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfSquareNumbers {

    /**
     * Given a non-negative integer c, decide whether there're two integers a and b such that
     * a2 + b2 = c.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: c = 5
     * Output: true
     * Explanation: 1 * 1 + 2 * 2 = 5
     */

    public static boolean judgeSquareSum(int c) {
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i * i <= c; i++) {
            int a = c - (i * i);
            if (tempMap.containsKey(a)) { //1
                return true;
            } else {
                tempMap.put(i * i, a);
            }
        }
        return false;
    }


    public static boolean omer(int c) {
        for (int a = 0; a <= c; a++) {
            for (int b = 0; b <= c; b++) {
                if (a * a + b * b == c) {
                    return true;
                }
            }
        }
        return false;
    }


    public static int[] twoSum(int[] nums, int target) {
        int temp = 0;
        Map<Integer, Integer> tempMap = new HashMap<>();
        int[] result;
        for (int i = 0; i < nums.length; i++) { //n
            temp = target - nums[i];
            if (tempMap.containsKey(temp)) { //1
                return new int[]{i, tempMap.get(temp)};
            }
            tempMap.put(nums[i], i);
        }
        return new int[]{0};
    }


    public static void main(String[] args) {
        System.out.println(judgeSquareSum(4));
    }
}
