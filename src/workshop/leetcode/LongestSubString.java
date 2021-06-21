package workshop.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     *
     *
     * kudretdavudov
     * Example 1:
     *
     * Input: s = "abcabcbb"
     * Map[a:0, b: 1, c: 2]
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     */
    public static int lengthOfLongestSubstring(String s) {
        int a_ptr = 0;
        int max = 0;

        Set<Character> set = new HashSet();


        for (int b_ptr = 0; b_ptr < s.length(); b_ptr++){
            if (!set.contains(s.charAt(b_ptr))){
                set.add(s.charAt(b_ptr));

            }else{
                while (set.contains(s.charAt(b_ptr))){
                    set.remove(s.charAt(a_ptr));
                    a_ptr++;
                }
                set.add(s.charAt(b_ptr));
            }
            max = Math.max(b_ptr - a_ptr + 1, max);

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
