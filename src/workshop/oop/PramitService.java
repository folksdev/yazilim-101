package workshop.oop;


public class PramitService extends UcgenService {

    @Override
    public int alanHesapla(Ucgen ucgen, int h){
        return (ucgen.getA() * h * h) / 2;
    }

    public int alanHesapla(int a, int b, int c, int h){
        Ucgen ucgen = new Ucgen(a, b, c);
        return alanHesapla(ucgen, h);
    }
}
