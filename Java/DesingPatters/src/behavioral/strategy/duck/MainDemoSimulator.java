package behavioral.strategy.duck;

import behavioral.strategy.duck.fly.FlyBehavior;
import behavioral.strategy.duck.quack.QuackBehavior;

public class MainDemoSimulator {
    public static void main(String [] args){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        FlyBehavior fly = () -> System.out.println("I can't fly");
        QuackBehavior quack = () -> System.out.println("Squeak");
        RubberDuck rubberDuck = new RubberDuck(fly, quack);
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        DecoyDuck	decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
    }
}
