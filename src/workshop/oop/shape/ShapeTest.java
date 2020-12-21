package workshop.oop.shape;

public class ShapeTest {

    public static void main(String[] args) {

        Circle daire = new Circle("daire", 2);
        Rectangle dortgen = new Rectangle("dikdortgen", 2, 3);
        Square kare = new Square("kare", 2);

        System.out.println(daire.alanHesapla());
        System.out.println(dortgen.alanHesapla());
        System.out.println(kare.alanHesapla());

        daire.ismiEkranaBas();
        dortgen.ismiEkranaBas();

    }
}
