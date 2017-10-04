package animal;

public class Cat extends Animal {

    /**
     * Instance variable The reason for using final is that it won´t change
     * unless Healthy pets changes its animal food. By using final we also
     * protect it from being modified and therefore secure it even further.
     */
    private final double divider = 150;

    //Constructor
    public Cat(double weight, String name) {
        //As it is super it passes the value on to the superclass
        super(weight, name);
    }

    /**
     * POLYMORFISM - This is Polyforism due to the it being overridden
     * (@Override) from the interface method. DYNAMIC BINDING - This is Dynamic
     * binding due to the fact that it jumps to find the method. In this case it
     * find the method in the subclass. If it would´nt find a method it would
     * result in a compile error.
     * @return
     */
    @Override
    public double getFoodAmount() {
        return getWeight() / divider;
    }

}
