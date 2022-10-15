package structural.decorator.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "The Dark Roast";
    }


    @Override
    public double cost() {
        return 0.99;
    }
}
