package workshop.step6.functions;

public class Functions2 {

    static boolean isPalindrome(String str) {
        String reverseStr = "";
        for(int i = str.length()-1; i > (str.length()/2)-1; i--){
            reverseStr += str.charAt(i);
        }
        return reverseStr.toLowerCase().equals(str.substring(0, (str.length()/2)+1).toLowerCase());
    }
    
    public static void main(String[] args) {
        Fonksiyonlar f = new Fonksiyonlar();

        System.out.println(isPalindrome("kazak"));
        System.out.println(isPalindrome("Kazak"));
        System.out.println(isPalindrome("java"));
    }

}
