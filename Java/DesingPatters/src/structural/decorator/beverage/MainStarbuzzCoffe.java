package structural.decorator.beverage;

public class MainStarbuzzCoffe {
    public static void main(String[] args){
        Beverage beverageDark = new DarkRoast();
        print(beverageDark);


        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);

        print(beverage);


    }

    static void print(Beverage beverage){
        System.out.println("Description: " + beverage.getDescription()
                + "\nCost: $" + beverage.cost());
    }
}
