package workshop.oop.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal("kuki");

        animal.setName("mavis");
        System.out.println(animal);
        Cat cat = new Cat("alfie", 1);
        Dog dog = new Dog("ollie");
        animal.eat("mama");

        cat.eat("ciger");

        dog.eat("kemik");


        Animal cat1 = new Cat("pamuk",2);

        System.out.println(((Cat)cat1).getAge());

        Animal dog1 = new Dog("boncuk");
        System.out.println(((Dog)dog1));


        System.out.println();

        cat.makeANoice();
        ((Animal)dog).makeANoice();

        /*
                        Animal
                    Cat        Dog
         */




    }
}
