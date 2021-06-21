package workshop.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class TwoSum {

    /**
     * Given an array of integers nums and an integer target,
     * return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Constraints:
     *
     * 2 <= nums.length <= 103
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     *
     * You can return the answer in any order.
     */

    public static int[] twoSum(int[] nums, int target) {
        int temp = 0;
        Map<Integer, Integer> tempMap = new HashMap<>();
        int []result;
        for (int i = 0; i < nums.length; i++){ //n
            temp = target - nums[i];
            if (tempMap.containsKey(temp)){ //1
                return new int[]{i, tempMap.get(temp)};
            }
            tempMap.put(nums[i], i);
        }
        return new int[]{0};
    }

    public static void main(String[] args) {

        /*int[] a = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(a, target);

        for (int b: result){
            System.out.println(b);
        }*/

        String a = null;
        Double b = 2.45D;
        System.out.println(b.doubleValue());
    }
}
