package workshop.step5.loops;

public class WhileLoop {
    public static void main(String[] args) {
        //initialize expression
        int i = 1;

        // test expression
        while (i < 5) {
            System.out.println("Hello World");
            // update expression
            i++;
        }
        System.out.println(i);
        i = 0;
        while(i < 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println(i);
        //i : 10
        int faktoriyel = 1;
        while (i > 0){
            faktoriyel *= i;
            i--; // i = i - 1
        }
        System.out.println(faktoriyel);
        //i : 0
        //Fibonacci serileri 0'dan baslayip iki onceki sayilarin
        // toplamini
        // bir sonraki elemani belirleyecek sekilde olusuturulur
        // 0, 1, (0 + 1), (1 + 1), (1 + 2), (2 + 3), (3 + 5), ...
        // 0| 1 |   1   |    2   |    3   |    5   |    8
        int count = 10, previous2nd = 0, previous1st = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        while(count > 0)
        {
            System.out.print(previous2nd+" ");
            int sumOfPrevTwo = previous2nd + previous1st;
            previous2nd = previous1st;
            previous1st = sumOfPrevTwo;
            count--;
        }

        System.out.println();
        int a = 10;
        int b = 0;
        while (a > 0 && b < 10){
            a--;
            b++;
        }
        System.out.println(b);
    }
}
