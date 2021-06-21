package workshop.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    /**
     * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     *
     * For example, the square matrix  is shown below:
     *
     * 1 2 3
     * 4 5 6
     * 9 8 9
     * Output Format
     *
     * Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
     *
     * Sample Input
     *
     * 3
     * 11 2 4
     * 4 5 6
     * 10 8 -12
     * Sample Output
     *
     * 15
     * Explanation
     *
     * The primary diagonal is:
     *
     * 11
     *    5
     *      -12
     * Sum across the primary diagonal: 11 + 5 - 12 = 4
     *
     * The secondary diagonal is:
     *
     *      4
     *    5
     * 10
     * Sum across the secondary diagonal: 4 + 5 + 10 = 19
     * Difference: |4 - 19| = 15
     *
     * https://www.hackerrank.com/challenges/diagonal-difference/problem
     */


    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int size = arr.size(), i = 0, left = 0, right = 0, j = size -1;

        for (int k = 0; k < size; k++){
            left += arr.get(i).get(i);
            right += arr.get(i).get(j);
            i++;
            j--;
        }

        return Math.abs(left - right);
    }

    public static void main(String[] args) {
        List<List<Integer>> a = Arrays.asList(
                Arrays.asList(11,2,4),
                Arrays.asList(4,5,6),
                Arrays.asList(10,8,-12)
        );
        System.out.println(diagonalDifference(a));
    }
}
