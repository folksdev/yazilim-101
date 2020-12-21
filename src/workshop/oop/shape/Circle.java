package workshop.oop.shape;

public class Circle extends Shape implements Drawable{

    private int yariCap;

    public Circle(String name,int yaricap) {
        super(name);
        this.yariCap = yaricap;
    }

    @Override
    int alanHesapla() {
        return (int) (3.14 * this.yariCap * this.yariCap);
    }

    @Override
    int cevreHesapla() {
        return (int) (2 * (3.14 * this.yariCap));
    }

    @Override
    public void ismiEkranaBas(){
        System.out.println("Benim adım : "  + this.getName());
    }
}
