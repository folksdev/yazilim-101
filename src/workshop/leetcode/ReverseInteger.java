package workshop.leetcode;

public class ReverseInteger {

    public static int reverse(int x) throws NumberFormatException{
        if (x < 0){
            return Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString()) * -1;
        }
        try {
            return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
