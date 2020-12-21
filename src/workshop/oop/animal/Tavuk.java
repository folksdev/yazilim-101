package workshop.oop.animal;

public class Tavuk extends Animal implements Kulucka {

    int kuluckaSuresi;

    public Tavuk(String name) {
        super(name);
    }

    @Override
    void eat(String yemek) {
        System.out.println(yemek + " yenildi");
    }

    @Override
    void makeANoice() {
        sesCikar(this.getName());
    }

    @Override
    public void sesCikar(String hayvanIsmi) {
        System.out.println("gıd gıd gıdaak");
    }

    @Override
    public void kuluckaSuresiAta() {
        this.kuluckaSuresi = 40;
    }

    @Override
    public int kuluckaSuresiGetir() {
        return this.kuluckaSuresi;
    }
}
