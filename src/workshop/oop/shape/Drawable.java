package workshop.oop.shape;

public interface Drawable{
    default void draw(){
        System.out.println("cizim yapılıyor!");
    }
}
