package workshop.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Pow {

    static short zero = 0, one = 1, two = 2, minusone = -1;
    public static double myPow(double x, int n) {
        if (n == zero || x == one || (x == minusone && n % two == 0)){
            return 1;
        } else if (x == minusone && n % two != zero){
            return minusone;
        }
        double result = 1;
        int unsignedN = (Integer.MIN_VALUE != n) ? Math.abs(n) : n - one;
        while (unsignedN > zero){
            if (result == zero){
                break;
            }
            if (n < zero) {
                result *= (one / x);
            } else {
                result *= x;
            }
            unsignedN--;
        }
        return result;
    }

    public static int superPow(int a, int[] b) {
        if (a == 1){
            return 1;
        } else if (a == 0){
            return 0;
        }
        int result = 1;
        int j = b.length;
        int[] c = new int[j];
        for (int k : b) {
            c[j - 1] = k;
            j = j - 1;
        }

        int i = 1;
        for (int x : c){
            x *= i;
            while (x > 0){

                result *= a % 1337;
                System.out.println(result);
                x--;
            }
            i *= 10;
        }
        return result % 1337;
    }

    public static int superPow2(int a, int[] b) {
        int result=1;

        for(int i=0; i<b.length; i++){
            result = (helper(result, 10) * helper(a, b[i])) % 1337; // result^10
        }

        return result;
    }

    public static int helper(int x, int n){
        if(n==0)
            return 1;
        if(n==1)
            return x%1337;

        return helper(x%1337, n/2)*helper(x%1337,n-n/2)%1337;
    }

    public static void main(String[] args) {
        //System.out.println(Math.pow(-1, 4));
        //System.out.println(myPow(0, 10));
        int[] b = {2,0,0};
        System.out.println(superPow(2147483647, b));
        //System.out.println((int)Math.pow(2147483647,200));
        //System.out.println(Integer.MAX_VALUE * Integer.MAX_VALUE);
    }
}
