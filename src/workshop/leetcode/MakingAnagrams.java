package workshop.leetcode;

import java.util.Map;
import java.util.stream.Collectors;

public class MakingAnagrams {

    /**
     * cde
     * abc
     * 4
     * d + e + a + b = 4
     * Explanation
     *
     * Delete the following characters from our two strings to turn them into anagrams:
     *
     * 1. Remove d and e from cde to get c.
     * 2. Remove a and b from abc to get c.
     * 4 characters have to be deleted to make both strings anagrams.
     *
     * https://www.hackerrank.com/challenges/making-anagrams/problem
     *
     * @param s1
     * @param s2
     * @return
     */

    static int makingAnagrams(String s1, String s2) {

        Map<String, Long> s1Map = s1.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        Map<String, Long> s2Map = s2.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));

        s2Map.forEach((k, v) -> s1Map.merge(k, v, (v1, v2) -> Math.abs(v1 - v2)));

        return s1Map.values().stream().reduce(0L, Long::sum).intValue();

    }

    static int makingAnagrams2(String s1, String s2) {

        int cArr[]=new int[26];
        for(int i=0;i<s1.length();i++)cArr[s1.charAt(i)-97]++;
        for(int i=0;i<s2.length();i++)cArr[s2.charAt(i)-97]--;
        int count=0;
        for(int i=0;i<26;i++){
            System.out.println(cArr[i]);
            count+=Math.abs(cArr[i]);
        }
        return count;

    }

    public static void main(String[] args) {
        //System.out.println(makingAnagrams("cde", "abc"));
        System.out.println(makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa"));

    }
}
