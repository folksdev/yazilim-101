package workshop.step2.datatypes;

/*

 Data Types

 Veri türü, bir tanımlayıcıda saklanabilecek değerlerin boyutunu ve türünü belirtir.


 Veri tipi veya basitçe tip, derleyiciye veya yorumlayıcıya programcının verileri nasıl kullanmak istediğini söyleyen bir veri niteliğidir.

 In Java, there are different types of variables, for example:

 - String - stores text, such as "Hello". String values are surrounded by double quotes
 - int - stores integers (whole numbers), without decimals, such as 123 or -123
 - float - stores floating point numbers, with decimals, such as 19.99 or -19.99
 - char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
 - boolean - stores values with two states: true or false

 For example, in the Java programming language, the type int represents the set of 32-bit integers ranging in value from −2,147,483,648 to 2,147,483,647

 Data types help up to define the data that we want to use. For example a student's score from an exam can be defined as int or the letter grade can be a char
 Veri tipleri bize kullanmak istediğimiz veriyi tanımlamamızı sağlar. Örnek olarak, bir öğrencinin sınav notunu tutmak için int, harf notunu tutmak için char kullanılabilir

 Variables
 A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.
 Variable is a name of memory location

*/

public class Variables {

    public static void main(String[] args) {

        /*
        To create a variable, you must specify the type and assign it a value:

        Syntax:
        type variableName = value;

        Where type is one of Java's types (such as int or String), and variable is the name of the variable (such as x or name). The equal sign is used to assign values to the variable.
         */

        // Integers are just numbers
        int grade1 = 80;

        int studentGrade = 80;


        //Put 'l' for long
        long longValue = 30000000000l;

        //Use . for floating points.
        float floatMoneyAmout = 100.0f; //put `f` for float
        double doubleMoneyAmount = 100.0;

        // Use '' to define a char
        char letterGrade = 'B';

        // Use "" to define a char
        String greeting = "Hello World!";

        boolean trueBool = true;
        boolean falseBool = false;


        //System.out.println(greeting); // Display the value of greeting
        //System.out.println(grade);

        /*
        Exercise - Define your own variables for types above and display their value
         */

        // Converting between types
        char letterA = 'A';
        int letterAsInt = letterA;

        long intAsLong = letterAsInt;
        float intAsFloat = letterAsInt;

        System.out.println(letterA);
        System.out.println(letterAsInt);
        System.out.println(intAsLong);
        System.out.println(intAsFloat);


        //Invalid conversations
       // int longAsInt = longValue;
        //String s = letterAsInt;

        /*
        Exercise - Define to ints a and b. Display their value. Then swap their values and display again.
         */
    }
}
