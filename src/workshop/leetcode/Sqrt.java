package workshop.leetcode;

public class Sqrt {

    /**
     * Given a non-negative integer x,
     * compute and return the square root of x.
     *
     * Since the return type is an integer,
     * the decimal digits are truncated, and only the integer part of the result is returned.
     *
     * Input: x = 4
     * Output: 2
     *
     * Input: x = 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842...,
     * and since the decimal part is truncated, 2 is returned.
     * root = 0.5 * (x + (n / x));
     *
     */
    public static boolean mySqrt(int x){


        return calculateRoot(x, 1, 0);
    }

    private static boolean calculateRoot(int x, int y, int count){
        int z = x - y;
        if (z == 0){
            return true;
        }

        if(z < 0){
            return false;
        }

        return calculateRoot(z, y + 2, count+1);
    }


    public static void main(String[] args) {

        System.out.println(mySqrt(8));

    }
}
