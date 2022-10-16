package structural.adapter.duck;

/**
 *  Main Class
 */
public class MainDuckSimulator {
    public static void main(String [] args){
        //Test Duck
        Duck duck = new MallardDuck();
        testDuck(duck);

        //Test Turquey
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);

        DroneAdapter adapter = new DroneAdapter(new SuperDrone());
        testDuck(adapter);
    }

   public static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
