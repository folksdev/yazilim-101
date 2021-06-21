package workshop.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptions {

    public static void main(String[] args) {
        /*int a = 10;
        int b = 5;
        System.out.println( a + " / " + b  + " = " + a/b);

        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        System.out.println("Lutfen sifir girmeyiniz!");
        int d = scan.nextInt();

        try {
            System.out.println( c + " / " + d  + " = " + c/d);
        } catch (ArithmeticException e){
            System.out.println("Bolen sayi sifir olamaz!");
            System.out.println(e.toString());
        } finally {
            System.out.println("Bu satir finally blogundadir");
        }

        System.out.println("Islem basarili");*/



        int[] a = new int[3];
        try {
            Scanner scan = new Scanner(System.in);
            int c = scan.nextInt();
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException ex){
            System.out.println("Array eleman sayisindan fazla eleman girisi yapildi " + a.length);
            System.out.println(ex.getCause());
        }

        System.out.println(a);

    }
}
