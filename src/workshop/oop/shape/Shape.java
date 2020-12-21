package workshop.oop.shape;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract int alanHesapla();
    abstract int cevreHesapla();

    public void ismiEkranaBas(){
        System.out.println(this.name);
    }
}
