package workshop.oop.animal;

public abstract class Animal {

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

    public void nefesAl(){
        System.out.println("nefes aldım");
    }

    abstract void eat(String yemek);

    abstract void makeANoice();

    public static class SubAnimal{
        public void a(){
            System.out.println("bu bir inner classtir");
        }
    }
}
