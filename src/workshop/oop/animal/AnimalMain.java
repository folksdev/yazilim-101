package workshop.oop.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

    public static void main(String[] args) {
        /*Animal animal = new Animal("kuki");

        animal.setName("mavis");
        System.out.println(animal);*/
        Cat cat = new Cat("alfie", 1);
        Dog dog = new Dog("ollie");
        //animal.eat("mama");

        cat.eat("ciger");

        dog.eat("kemik");


        //Animal cat1 = new Cat("pamuk",2);

        //System.out.println(((Cat)cat1).getAge());

        Animal dog1 = new Dog("boncuk");
        System.out.println(((Dog)dog1));


        System.out.println();

        cat.makeANoice();
        ((Animal)dog).makeANoice();


        cat.sesCikar("kuki");
        Bird bird = new Bird();
        bird.sesCikar("mavis");
        bird.kuluckaSuresiAta();
        System.out.println(bird.kuluckaSuresiGetir());

        Tavuk tavuk = new Tavuk("cilli");
        tavuk.kuluckaSuresiAta();
        System.out.println(tavuk.kuluckaSuresiGetir());

        Kulucka tavuk1 = new Tavuk("sari cilli");
        Kulucka bird1 = new Bird();

        Animal tavuk2 = (Animal) tavuk1;

        System.out.println(tavuk2 instanceof Kulucka);
        System.out.println(bird1 instanceof Bird);
        ((Animal) tavuk1).makeANoice();
        tavuk.eat("yem");

        System.out.println(tavuk1.toString());
        System.out.println(cat.toString());

        /*
                        Animal
                    Cat        Dog
         */




    }
}
