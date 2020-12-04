package workshop.oop;

import java.util.Objects;

public class Ucgen {

    private int a;
    private int b;
    private int c;
    private int cevre;

    public Ucgen(){

    }

    public Ucgen(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.cevre = UcgenService.cevreHesapla(a,b,c);
    }

    public Ucgen(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = 10;
    }
    public Ucgen(int a) {
        this.a = a;
        this.b = a / 2;
        this.c = a * 2;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getCevre() {
        return cevre;
    }

    public void setCevre(int cevre) {
        this.cevre = cevre;
    }

    @Override
    public String toString() {
        return "Ucgen{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", cevre=" + cevre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ucgen ucgen = (Ucgen) o;
        return a == ucgen.a &&
                b == ucgen.b &&
                c == ucgen.c &&
                cevre == ucgen.cevre;
    }

    public int cevreHesapla(int a, int b, int c){
        return a + b + c;
    }

}
