package workshop.oop.animal;

public class Dog extends Animal implements AnimalInterface{

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

    @Override
    public void makeANoice(){
        bark();
    }

    @Override
    public void sesCikar(String hayvanIsmi) {
        System.out.println("hav hav hav");
    }
}
