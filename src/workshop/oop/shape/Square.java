package workshop.oop.shape;

public class Square extends Shape implements Drawable {

    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    int alanHesapla() {
        return a * a;
    }

    @Override
    int cevreHesapla() {
        return a + a;
    }
}
