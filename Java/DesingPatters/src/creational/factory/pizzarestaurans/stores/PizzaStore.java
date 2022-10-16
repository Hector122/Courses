package creational.factory.pizzarestaurans.stores;

import creational.factory.pizzarestaurans.Pizza;
import creational.factory.pizzarestaurans.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        System.out.println("Making a " + type.name() + " Pizza");
        pizza.prepare();
        pizza.bake();
        pizza.curl();
        pizza.box();

        return pizza;
    }

    /**
     * Abstract method to all pizza franchiese
     * @return
     */
    protected abstract Pizza createPizza(PizzaType type);
}
