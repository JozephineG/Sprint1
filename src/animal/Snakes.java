package animal;

public class Snakes extends Animal  {
    /**
     * Instance variable
     * The reason for using final is that it won´t change unless Healthy pets
     * changes its animal food. By using final we also protect it from being 
     * modified and therefore secure it even further.
     * The final amount is also put at 20 due to the reason that the amount of 
     * food is not dependant on the weight og the animal and would only be 
     * subject to change if HealthyPets where to change animal food.
     */
    private final double snakeFood = 20;

    //Constructor
    public Snakes(double weight, String name) {
        //As it is super it passes the value on to the superclass
        super(weight, name);
    }
    /**
     * POLYMORFISM - This is Polyforism due to the it being overridden
     * (@Override) from the interface method.
     * DYNAMIC BINDING - This is Dynamic binding due to the fact that it jumps 
     * to find the method. In this case it find the method in the subclass. If
     * it would´nt find a method it would result in a compile error.
     * @return 
     */
    @Override
    public double getFoodAmount() {
        return snakeFood;
    }
}
