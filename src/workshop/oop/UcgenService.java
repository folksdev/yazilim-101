package workshop.oop;

public class UcgenService {

    public static int cevreHesapla(int a, int b, int c){
        return a + b + c;
    }

    public static boolean isTriangle(Ucgen ucgen){
        return ucgen.getA() > 0 && ucgen.getB() > 0 && ucgen.getC() > 0;
    }

    public int alanHesapla(Ucgen ucgen, int h){
        return (ucgen.getA() * h) / 2;
    }

}
