package creational.factory.pizzarestaurans.stores;

import creational.factory.pizzarestaurans.Pizza;
import creational.factory.pizzarestaurans.PizzaType;
import creational.factory.pizzarestaurans.pizzastyle.ChicagoCheesePizza;
import creational.factory.pizzarestaurans.pizzastyle.ChicagoPeperoniPizza;
import creational.factory.pizzarestaurans.pizzastyle.ChicagoVeggiePizza;

public class ChicagoStylePizzaStoreFactory extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new ChicagoCheesePizza();
            case VEGGIE:
                return new ChicagoVeggiePizza();
            case PEPERONI:
                return new ChicagoPeperoniPizza();
            default:
                return null;
        }
    }
}
