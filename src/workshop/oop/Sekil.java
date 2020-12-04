package workshop.oop;

public class Sekil {
    public static void main(String[] args) {

        Ucgen ucgen1 = new Ucgen(4,5,6);

        Ucgen ucgen3 = new Ucgen(4,5,6);

        System.out.println(ucgen1.equals(ucgen3));
        System.out.println(ucgen1);
        System.out.println(UcgenService.alanHesapla(ucgen1, 5));

        Ucgen ucgen2 = new Ucgen(4);
        System.out.println(ucgen2);

        String a = ucgen1.toString();
    }

}
