package workshop.leetcode;

public class RomanToNumber {

    static int convertRomanSymbol(char r) {
        switch (r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }

    static int romanToDecimal(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = convertRomanSymbol(s.charAt(i));

            if (i + 1 < s.length()) {
                int s2 = convertRomanSymbol(s.charAt(i + 1));

                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        String str = "MCMXCVI";
        System.out.println("Integer form of " +
                str + " " +
                "Roman Numeral is " +
                romanToDecimal(str));
    }




}


