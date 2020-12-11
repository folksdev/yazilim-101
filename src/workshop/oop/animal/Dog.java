package workshop.oop.animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println("Havhavhav!");
    }

    public void eat(String yemek){
        bark();
        System.out.println(yemek + " Feeding");
    }

    public void makeANoice(){
        bark();
    }
}
