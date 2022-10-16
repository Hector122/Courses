package creational.builder;

public class LunchOrder {
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    /**
     * Inner static class builder.
     */
    public static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder(){

        }

        // Build object to finish the call .
        public LunchOrder build(){
            return new LunchOrder(this);
        }

        //Methods that return this object.
        public  Builder bread(String bread){
            this.bread = bread;
            return this;
        }
        public  Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public  Builder dressing(String dressing){
            this.dressing = bread;
            return this;
        }
        public  Builder meat(String meat){
            this.meat = bread;
            return this;
        }
    }

    //Constructors
    private LunchOrder(Builder builder){
        bread = builder.bread;
        condiments = builder.condiments;
        dressing = builder.dressing;
        meat = builder.meat;
    }

    // Getters
    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
