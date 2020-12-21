package workshop.oop.animal;

public class Bird implements Kulucka {

    private int kuluckaSuresi;

    @Override
    public void sesCikar(String hayvanIsmi) {
        System.out.println("cik cik cik");
    }

    @Override
    public void kuluckaSuresiAta() {
        this.kuluckaSuresi = 20;
    }

    @Override
    public int kuluckaSuresiGetir() {
        return this.kuluckaSuresi;
    }
}
