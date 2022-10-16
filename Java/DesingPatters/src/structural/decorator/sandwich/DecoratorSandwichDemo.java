package structural.decorator.sandwich;

public class DecoratorSandwichDemo {

    public static void main(String args[]) {
        Sandwich sandwich = new SimpleSandwich();
        sandwich = new MeatDecorator(sandwich);
        sandwich = new DressingDecorator(sandwich);

        System.out.println(sandwich.make());

    }
}
