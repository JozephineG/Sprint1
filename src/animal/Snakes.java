package animal;

public class Snakes extends Animal implements FoodCalculation {

    private final double snakeFood = 20;

    public Snakes(double weight){
        super(weight);
    }
    @Override
    public double getFoodAmount() {
        return snakeFood;
    }
}
