package animal;

public class Dog extends Animal implements FoodCalculation {

    private final double divider = 100;
    
    public Dog (double weight){
        super(weight);
    }
    
    @Override
    public double getFoodAmount() {
        return getWeight() / divider;
    }
}
