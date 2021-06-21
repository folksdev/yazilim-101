package workshop.oop.animal;

public class Cat{

    private String name;

    public String sayHello(){
        return "Hello Peeps, my name is : " + name.toLowerCase();
    }

    public Cat(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow(){
        System.out.println("Miyaaaav!");
    }

    public void eat(String yemek){
        meow();
        System.out.println(yemek + " Feeding");
    }

    void makeANoice() {
        meow();
    }

    public void sesCikar(String hayvanIsmi) {
        System.out.println("miyav miyav");
    }
}
