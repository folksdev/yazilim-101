package workshop.oop.animal;

public class Cat extends Animal {

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

    public void eat(String yemek){
        meow();
        System.out.println(yemek + " Feeding");
    }

}
