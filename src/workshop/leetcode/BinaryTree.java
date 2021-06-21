package workshop.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BinaryTree {

    /**
     * Given a binary tree, write a method to determine
     * shortest distance between two nodes.
     */

    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("A");
        a.add(null);
        a.add("C");

        List<String> b = a.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(b.size());
        System.out.println(b);
    }
}
