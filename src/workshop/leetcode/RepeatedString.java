package workshop.leetcode;

import java.beans.PropertyEditorSupport;

public class RepeatedString {

    /*
    aba
    10

    7
     */
    public static long repeatedString(String s, long n) {
        // Write your code here
        if(!s.contains("a")){
            return 0;
        }
        if(s.length() == 1){
            return n;
        }
        long carier = n % s.length();
        long repeteadStr = 0l;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                repeteadStr++;
            }
        }

        repeteadStr = (n / s.length()) * repeteadStr;
        if (carier > 0) {
            for (int i = 0; i < s.substring(0, (int) carier).length(); i++){
                if(s.charAt(i) == 'a'){
                    repeteadStr++;
                }
            }
        }

        return repeteadStr;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
}
