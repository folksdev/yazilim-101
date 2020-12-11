package workshop.oop.animal;


public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void eat(String yemek){
        System.out.println("Feeding");
    }

    public void makeANoice(){
        System.out.println("Noice");
    }

    public static class SubAnimal{
        public void a(){
            System.out.println("bu bir inner classtir");
        }
    }
}
