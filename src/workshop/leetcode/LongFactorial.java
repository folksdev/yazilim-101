package workshop.leetcode;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LongFactorial {

    static BigDecimal factorial(BigDecimal n){
        if (n.equals(BigDecimal.ONE))
            return BigDecimal.ONE;
        System.out.println(n);
        return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
    }

    public static void main(String[] args) {
        System.out.println(factorial(new BigDecimal("100")));
    }
}
