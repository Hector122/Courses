package creational.factory.pizzarestaurans.stores;

import creational.factory.pizzarestaurans.Pizza;
import creational.factory.pizzarestaurans.PizzaType;
import creational.factory.pizzarestaurans.pizzastyle.*;

public class NYStylePizzaStoreFactory extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
            switch (type) {
                case CHEESE:
                    return new NYCheesePizza();
                case VEGGIE:
                    return new NYVeggiePizza();
                case PEPERONI:
                    return new NYPeperoniPizza();
                default:
                    return null;
            }
    }
}
