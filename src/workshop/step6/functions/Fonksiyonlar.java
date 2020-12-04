package workshop.step6.functions;

import workshop.oop.Sekil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fonksiyonlar {
    
    public int x = 100;
    
    protected int topla(int a, int b){
        return a + b;
    }
    
    public void carp(int a){
        x *= a;
    }

    public int bol(int a, int b){
        if(b == 0){
            return 0;
        }
        return a / b;
    }
    
    private int carp(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Fonksiyonlar func = new Fonksiyonlar();
        System.out.println(func.x);
        func.carp(10);
        System.out.println(func.x);
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(16);
        list.add(1);
        list.add(24);


        System.out.println("The max number of list: " + Collections.max(list));

        System.out.println("Listedeki cift sayilar:");
        listedekiCiftSayilariYazdir(list);

        List<String> students = new ArrayList<>();
        students.add("Mert");
        students.add("Talha");
        students.add("Zeynep");
        students.add("Kadir");
        students.add("Hülya");
        students.add("Çağrı");

        System.out.println("Turkce karakterli ogrenci isimleri :");
        turkceKarakterliKelimeyiYazdir(students);

        List<String> sehirList = new ArrayList<>();
        sehirList.add("Çanakkale");
        sehirList.add("İstanbul");
        sehirList.add("Ankara");
        sehirList.add("Manisa");
        sehirList.add("İzmir");

        List<String> trSehir = turkceKarakterliKelimeyiBul(sehirList);

        System.out.println(trSehir);

        Fonksiyonlar f = new Fonksiyonlar();
        int b = f.bol(123, 3);
        int c = f.carp(123, 3);
        func.carp(5);
        int bolme = func.bol(func.x, 5);
        System.out.println(bolme);

        String a = new String();

        List<Integer> aList = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(1356);
        list2.add(16);
        list2.add(1);
        list2.add(24);
        list2.add(24);
        list2.add(24);
        list2.add(24);
        listedekiCiftSayilariYazdir(list2);

    }

    public static void listedekiCiftSayilariYazdir(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                System.out.println(i + " : " + list.get(i));
            }
        }
    }


    static void turkceKarakterliKelimeyiYazdir(List<String> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).matches(".*(Ç|ç|Ö|ö|Ğ|ğ|Ü|ü|ı|İ|ş|Ş]).*")){
                System.out.println(i + " : " + list.get(i));
            }
        }
    }

    static List<String> turkceKarakterliKelimeyiBul(List<String> list){
        List<String> kelime = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).matches(".*(Ç|ç|Ö|ö|Ğ|ğ|Ü|ü|ı|İ|ş|Ş]).*")){
                kelime.add(list.get(i));
            }
        }
        return kelime;
    }
}
