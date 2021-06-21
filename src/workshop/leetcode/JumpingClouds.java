package workshop.leetcode;

import java.util.Arrays;
import java.util.List;

public class JumpingClouds {

    /*

        0 0 1 0 0 1 0
        4
        0 0 1 1 0 1 0
        0


     */
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int result = 0;
        for (int i = 0; i < c.size() - 1; i++){
            if(i+2 < c.size() && c.get(i+2) == 0){
                result++;
                i++;
            } else if(i+1 < c.size() && c.get(i+1) == 0) {
                result++;
            } else {
                result = 0;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0)));
    }
}
