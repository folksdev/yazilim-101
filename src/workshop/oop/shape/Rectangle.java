package workshop.oop.shape;

public class Rectangle extends Shape implements Drawable{

    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("A Rectangle drawing");
    }

    @Override
    int alanHesapla() {
        return a * b;
    }

    @Override
    int cevreHesapla() {
        return a + a + b + b;
    }
}
