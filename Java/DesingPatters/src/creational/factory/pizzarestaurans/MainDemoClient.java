package creational.factory.pizzarestaurans;

import creational.factory.pizzarestaurans.stores.ChicagoStylePizzaStoreFactory;
import creational.factory.pizzarestaurans.stores.NYStylePizzaStoreFactory;
import creational.factory.pizzarestaurans.stores.PizzaStore;

public class MainDemoClient {
    public static void main (String[] args) {
        PizzaStore chicagoStyle = new ChicagoStylePizzaStoreFactory();
        Pizza pizza  = chicagoStyle.orderPizza(PizzaType.CHEESE);
        System.out.println("You order a " + "");

        PizzaStore nyStyle = new NYStylePizzaStoreFactory();
        pizza  = nyStyle.orderPizza(PizzaType.VEGGIE);
        System.out.println("You order a " + "");
    }

}
