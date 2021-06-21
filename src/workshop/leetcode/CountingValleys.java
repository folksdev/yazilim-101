package workshop.leetcode;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingValleys {
    /*
    DDUUDDUDUUUD
    = 2
_/\      _
   \    /
    \/\/
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        // UDDDUDUU -> U = 4 D = 4
        int seaLevelEnter = 0;
        int result = 0;
        List<Character> step = path.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        for (Character c: step){
            if(c.equals('U')){
                seaLevelEnter++;
            } else if (c.equals('D')){
                seaLevelEnter--;
            }

            if(!c.equals('U') && seaLevelEnter == -1){
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));

    }
}
