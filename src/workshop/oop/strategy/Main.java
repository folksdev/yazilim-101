package workshop.oop.strategy;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println(context.executeStrategy(10, 5));

        context = new Context(new Subtract());
        System.out.println(context.executeStrategy(10, 5));

        context = new Context(new Multiply());
        System.out.println(context.executeStrategy(10, 5));
    }
}


