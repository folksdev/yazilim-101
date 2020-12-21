package workshop.oop.animal;

public class Cat extends Animal implements AnimalInterface{

    private int age;
    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void meow(){
        System.out.println("Miyaaaav!");
    }

    @Override
    public void eat(String yemek){
        meow();
        System.out.println(yemek + " Feeding");
    }

    @Override
    void makeANoice() {
        meow();
    }

    @Override
    public void sesCikar(String hayvanIsmi) {
        System.out.println("miyav miyav");
    }
}
