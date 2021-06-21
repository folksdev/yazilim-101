package workshop.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {

        Map<String, Long> magazineMap = Arrays.stream(magazine).collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        Map<String, Long> noteMap = Arrays.stream(note).collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        boolean allContain = noteMap.keySet().stream().allMatch(magazineMap::containsKey) &&
                noteMap.keySet().stream().allMatch(key -> magazineMap.get(key) >=noteMap.get(key));


        System.out.println(allContain ? "Yes" : "No");

    }

    public static void main(String[] args) {
        checkMagazine(new String[]{"two", "times", "three", "is", "not","four"},
                new String[]{"two", "times", "two", "is", "four"});

    }
}
