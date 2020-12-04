package workshop.step3.decisionmaking;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        // write your code here
       /* System.out.println("Hello World!");
        System.out.println("Yazılım 101 Kursuna Hoşgeldiniz!");


        Scanner inputAValue = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int value = inputAValue.nextInt();
//value = 101
        if (value < 100) {
            System.out.println("Girilen deger 100den kucuktur. Deger: " + value);
            if (value >= 10) {
                System.out.println("Girilen deger 2 basamaklidir. Deger: " + value);
            }
        } else {
            System.out.println("Girilen sayi 2 basamakli degildir");
        }

        //value = 100;
        if (value == 100){
            System.out.println("Sayi 100");
        }
        System.out.println("Sayi 100 degil");

        //////
        if (value == 100){
            System.out.println("Sayi 100");
        } else {
            System.out.println("Sayi 100 degil");
        }


//value 12361982
        if (value % 2 == 0) {
            System.out.println("Girilen sayi ciftir");
        } else {
            System.out.println("Girilen sayi tektir.");
        }


        if (value % 2 == 0){
            System.out.println("2");
        } else if (value % 3 == 0){
            System.out.println("3");
        } else if (value % 6 == 0) {
            System.out.println("6");
        } else {
            System.out.println("Hata!");
        }*/

//value = -12
//value = 12
//value = 0
/*

        if (value < 0){
            System.out.println("negatif");
        } else if (value > 0){
            System.out.println("pozitif");
        } else {
            System.out.println("sayi sifir");
        }

        System.out.println("Kontrol bitti");

        int a = value;
        int b = inputAValue.nextInt();
        int c = inputAValue.nextInt();

        if ((a == b && b != c) || (b == c && c != a) || (c == a && c != b)){
            System.out.println("En az iki sayi esit");
        } else {
            System.out.println("En az iki sayi esit degil");
        }
*/

        Scanner scanner = new Scanner(System.in);
/*

        System.out.println("Birinci sayiyi girin");
        int sayi1 = scanner.nextInt();
        System.out.println("Ikinci sayi girin");
        int sayi2 = scanner.nextInt();
        System.out.println("Yapilacak islemi girin");
        String islem = scanner.next();
        float sonuc = 0.0f;
        switch (islem){
            case "+" :
                sonuc = sayi1 + sayi2;
                System.out.println("Toplama islemi");
                break;
            case "-" :
                sonuc = sayi1 - sayi2;
                System.out.println("Cikarma islemi");
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                System.out.println("Carpma islemi");
                break;
            case "/":
                sonuc = (float) sayi1 / sayi2;
                System.out.println("Bolme islemi");
                break;
            default:
                System.out.println("Hatali islem girisi");
        }
        System.out.println("Sonuc : " + sonuc);

*/

        String day = scanner.next();
        //MONDAY
        //Monday
        //MonDAy
        //monday
        switch(day.toLowerCase()) {
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Weekday ");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekend ");
                break;
            default:
                System.out.println("Not a day ");
        }

    }
}
