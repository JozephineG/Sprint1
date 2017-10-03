package animal;

public abstract class Animal implements FoodCalculation {
    /**
     * Insance variable
     * By using a private modifier for the instance variable we have 
     * incapsulated it and in order to access it we need to have a getter. 
     * @return 
     */
    private double weight;
    private String name;
    
    //Constructor
    public Animal(double weight, String name){
        this.weight = weight;
        this.name = name;
    }
    /**
     * Returns the weight of the animal
     * @return 
     */
    public double getWeight(){
        return weight;
    }
    /**
     * Returns the name of the animal
     * @return 
     */
    public String getName(){
        return name; 
    }
    
}
