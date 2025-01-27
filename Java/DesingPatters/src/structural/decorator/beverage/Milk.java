package structural.decorator.beverage;

public class Milk extends CondimentDecorator {
   private Beverage beverage;

    /** Constructor
     *
     * @param beverage
     */
   public Milk(Beverage beverage){
       this.beverage = beverage;
   }

   @Override
    public String getDescription() {
        return  beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.6 ;
    }
}
