package workshop.leetcode;

import java.util.Set;
import java.util.stream.Collectors;

public class CommonSubstrings {

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set<String> s1Set = s1.chars().mapToObj(String::valueOf).collect(Collectors.toSet());
        Set<String> s2Set = s2.chars().mapToObj(String::valueOf).collect(Collectors.toSet());

        boolean contain = s1Set.stream().anyMatch(s2Set::contains);

        return contain ? "YES" : "NO";
    }

    public static void main(String[] args) {

    }
}
