package animal;

public class Cat extends Animal implements FoodCalculation {

    private final double divider = 150;

    public Cat(double weight){
        super(weight);
    }
    @Override
    public double getFoodAmount() {
        return getWeight() / divider;
    }

}
