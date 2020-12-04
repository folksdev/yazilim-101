package workshop.step2.datatypes;

public class Strings {

    public static void main(String args[]) {


        // The most direct way to create a string is to write
        String string = "I am a string!";
        System.out.println(string);

        // A string has a length
        System.out.println(string.length());

        // A String is actually a char array which means every char in string has an index
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));

        // String can be converted to char array and can be created from char array
        char[] stringArray = string.toCharArray();

        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        //Concatenating Strings
        String string1 = "String1";
        String string2 = "String2";
        String string3 = string1.concat(string2);
        String string4 = string2.concat(string1);
        String string5 = string2.concat("Another String"); // can write it like this
        String string6 = "Another String".concat("Another String");
        String string7 = "Another String" + "Another String" + "1234";

        //Creating Format Strings
        float floatVar = 123.231231f;
        int intVar = 23;
        String stringVar = "asdf1234";
        String formatted = String.format("The value of the float variable is " +
                "%2f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);

        System.out.println(formatted);

        //String Methods
        String s1 = "String1";

        int length = string1.length();
        boolean isEqS1S2 = string1.equals(string2);
        boolean isEqS1S1 = string1.equals(s1);
        boolean isCEqS1S1 = string1.contentEquals(s1); // use content equals for value comparison

        String lowerCase = s1.toLowerCase();
        String upperCase = s1.toUpperCase();

        System.out.println(length);
        System.out.println(isEqS1S2);
        System.out.println(isEqS1S1);
        System.out.println(isCEqS1S1);

        System.out.println(lowerCase);
        System.out.println(upperCase);

        System.out.println(lowerCase.equals(s1));
        System.out.println(lowerCase.contentEquals(s1));
        System.out.println(upperCase.equals(s1));
        System.out.println(upperCase.contentEquals(s1));

    }


}
