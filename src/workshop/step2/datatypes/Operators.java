package workshop.step2.datatypes;

/*

    Operators are used to perform operations on variables and values. Java provides a rich set of operators to manipulate variables.

    - Arithmetic Operators
    - Relational Operators
    - Bitwise Operators
    - Logical Operators
    - Assignment Operators
    - Misc Operators


 */
public class Operators {

    public static void main(String[] args) {

        /*
        Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra
         */
        int a = 30, b = 20, c = 25; // Define multiple ints in one line

        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        float divFloat = (float) a / b;
        int mod = a % b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(mod);

        /*
        Execise - Implement ((x * 2) + 10) / 2 = ?
         */


        /*
         + can be applied to strings
         */
        String firstString = "First Place";
        String secondString = "Second Place";

        String firstSecond = firstString + secondString;
        String secondFirst = secondString + firstString;

        System.out.println(firstSecond);
        System.out.println(secondFirst);

        /*
        Relational operators

        == (equal to)
        != (not equal to)
        > (greater than)
        < (less than)
        >= (greater than or equal to)
        <= (less than or equal to)
         */

        int num1 = 10, num2 = 20, num3 = 10, num4 = 40, num5 = 50;

        boolean isEqNum1Num2 = num1 == num2;
        boolean isEqNum1Num3 = num1 == num3;

        boolean isNeqNum1Num2 = num1 != num2;

        boolean isGtNum1Num5 = num1 > num5;
        boolean isGtNum5Num4 = num5 > num4;

        boolean isGteNum5Num4 = num5 >= num4;

        boolean isLtNum5Num4 = num5 < num4;
        boolean isLtNum1Num5 = num1 < num5;

        boolean isLteNum1Num5 = num1 < num5;

        System.out.println(isEqNum1Num2);
        System.out.println(isEqNum1Num3);
        System.out.println(isNeqNum1Num2);
        System.out.println(isGtNum1Num5);
        System.out.println(isGtNum5Num4);
        System.out.println(isGteNum5Num4);
        System.out.println(isLtNum5Num4);
        System.out.println(isLtNum1Num5);
        System.out.println(isLteNum1Num5);

        /*
        Logical operators

        && (logical and)
        || (logical or)
        ! (logical not)
         */

        boolean logicalAndExample = true && false; //false
        boolean logicalAndExample2 = true && true; //true
        boolean logicalAndExample3 = false || false; //false

        // int num1 = 10, num2 = 20, num3 = 10, num4 = 40, num5 = 50;
        // boolean isEqNum1Num2 = num1 == num2;
        // boolean isEqNum1Num3 = num1 == num3;
        //                          false      &&      true
        boolean logicalAndFalse = num1 == num2 && num1 == num3; //false
        boolean logicalAndTrue = isEqNum1Num3 && isNeqNum1Num2;
        //                            true        &&       true
        boolean logicalAndInline = (num5 > num4) && (num1 != num2);


        boolean logicalOrExample = false || true;
        boolean logicalOrExample2 = true || true;
        boolean logicalOrFalse = isEqNum1Num3 || isEqNum1Num2;
        boolean logicalOrTrue = isEqNum1Num3 || isNeqNum1Num2;
        boolean logicalOrInline = (num5 > num4) || (num1 != num2);

        boolean logicalNotExample = !false;
        boolean logicalNotExample2 = !true;
        boolean logicalNotInline = !(num5 > num4);


        boolean complexExample = isEqNum1Num3 && isNeqNum1Num2 || isEqNum1Num2; // ?
        boolean inlineExample = (num5 > num4) || ((num1 != num2) && (num1 < num5)); // ?
                                      
        /*
        Assignment operators
         */

        int op1 = 10; // assign value

        int op2 = 20;
        op2 += op1; // op2 = op2 + op1

        int op3 = 30;
        op3 -= op1; // op3 = op3 - op1

        int op4 = 40;
        op4 *= op1; // ?

        int op5 = 50;
        op5 /= op1; // ?


    }

}
