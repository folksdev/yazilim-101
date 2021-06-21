package workshop.leetcode;

public class SmartSubstring {
    /**
     * "Smart substring"
     * Write a function that takes maximum 30 characters from a string but without cutting the words.
     *
     * Full description:
     * "Featuring stylish rooms and moorings for recreation boats, Room Mate Aitana is a designer
     * hotel built in 2013 on an island in the IJ River in Amsterdam."
     *
     * First 30 characters:
     * "Featuring stylish rooms and mo"
     *
     * Smarter approach (max 30 characters, no words are broken):
     * "Featuring stylish rooms and"
     */
    public static String smartSubString(String str){
        if (str.length() <= 30){
            return str;
        }
        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String word: words){
            if(builder.toString().length() + word.length() >= 30){
                break;
            }
            builder.append(word);
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(smartSubString(" Featuring stylish rooms and moorings for recreation boats, " +
                "Room Mate Aitana is a designer hotel built in 2013 on an island in the IJ River " +
                "in Amsterdam."));
    }

}
