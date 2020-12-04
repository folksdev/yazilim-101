package workshop.step5.loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        int a = 0;
        System.out.print(a);
        a = a + 1;
        System.out.print(a);
        a = a + 1;
        System.out.print(a);
        a = a + 1;
        System.out.print(a);
        a = a + 1;
        System.out.println(a);


        for (int i = 0; i < 10; i = i + 1){
            System.out.print(i);
        }


        System.out.println();

        /* 10! hesaplama = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
        int faktoriyel = 1;
        int i = 10;
        faktoriyel = faktoriyel * i;
        i = i - 1;
        if (i > 0){
            faktoriyel = faktoriyel * i;
        }
        i = i - 1;
        if (i > 0){
            faktoriyel = faktoriyel * i;
        }
        ...
         */
        //10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 578900

        int faktoriyel = 1;
        for (int i = 10; i > 0; i--){
            // faktoriyel = faktoriyel * i;
            faktoriyel *= i;
            System.out.print(i);
            if (i != 1){
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + faktoriyel);

        for (char i = 'a'; i != 'z' + 1; i++){
            System.out.print(i);
        }
        System.out.println();

        //For kosuluna yazilan onerme dogru bir onerme olmazsa sonsuz dongu olusur.
        //kosul ilk durumda da karsilanmaz ise for dongusu hic calismaz.
        /*for (int i = 1; i > 0; i++){
            System.out.println(i);
        }*/
        //Kod blogunun icinde tanimlanan degerler, kod blogunun disinda ulasilamaz.
        for (int i = 1; i < 10; i = i+2){
            //int y = i;
            System.out.print(i + " ");
        }
        //System.out.println(y);
        System.out.println();

        //Ic-ice for donguleri - nested for loop
        //ic ice donguler matematikdeki matris carpimi mantigi ile calisir
        // 2 * ( 3 + 4 ) = (2 * 3) + (2 * 4)
        // [1,2,3,4,5,6]
        // [[1,1],[1,2],[1,3]]
        int n = 3;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(String.format("i = %d, j = %d", i, j));
            }
        }
        for (int i = 0; i < 3; i++){
            System.out.print(i + " : { ");
            for (int j = 0; j < 3; j++){
                System.out.print(j + " ");
            }
            System.out.println("}");
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++){
            ///
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
            ///
        }
        System.out.println();
        for (int i = 4; i > 0; i--){
            for (int j = i; j > 0; j--){ // i:3 j:3
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=0; i<5; i++) {
            for (int j=5-i; j>1; j--){
                System.out.print(" "); //print space
            }
            for (int j=0; j<=i; j++ ){
                System.out.print("* "); //print star
            }
            System.out.println(); //ending line after each row
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Bir asal sayi giriniz: ");
        int value = input.nextInt();
        boolean isPrimeNumber = true;
        int dividedNumber = 0;
        for (int i = 2; i < value - 1; i++){
            if (value % i == 0) {
                isPrimeNumber = false;
                dividedNumber = i;
                break;
            }
        }
        System.out.print("Girilen " + value + " degeri asal");
        if (isPrimeNumber){
            System.out.println(" sayidir.");
        } else {
            System.out.println(" sayi degildir. " + dividedNumber + " degerine bolunebilir.");
        }

    }


}
