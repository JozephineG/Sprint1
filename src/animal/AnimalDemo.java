package animal;

import javax.swing.JOptionPane;

public class AnimalDemo {

    public static void main(String[] args) {
        /**
         * Objects (instances9 representing the animals currently at 
         * HealthyPets. An argument is inputed with their weight and name. 
         * 
         */
        Animal sixten = new Dog(5000, "sixten");
        Animal dogge = new Dog(10000, "dogge");
        Animal venus = new Cat(5000, "venus");
        Animal ove = new Cat(3000, "ove");
        Animal hypno = new Snakes(1000, "hypno");
        /**
         * Shows an input window for input of the name of te given animal.
         */
        String whatAnimal = JOptionPane.showInputDialog(null,
                "Vilket djur ska få mat?");
        /**
         * After the name is input the name is run through the switch statement
         * until it find the correct slot and prints the statement in theat 
         * specific switch slot. If none of the switch statments fit the name 
         * than the default statement will be printed informing the user that 
         * the name does not exist in the system. This switch statement is not
         * sensitive to letter size as it takes in all names and switches it all
         * to lower case, limiting at least a part of the potential error that 
         * could occur from users. 
         */
        switch (whatAnimal.toLowerCase()) {
            case "sixten":
                JOptionPane.showMessageDialog(null,
                        "Hundfoder: " + sixten.getFoodAmount() + " gram");
                break;
            case "dogge":
                JOptionPane.showMessageDialog(null,
                        "Hundfoder: " + dogge.getFoodAmount() + " gram");
                break;
            case "venus":
                JOptionPane.showMessageDialog(null,
                        "Kattfoder: " + venus.getFoodAmount() + " gram");
                break;
            case "ove":
                JOptionPane.showMessageDialog(null, 
                        "Kattfoder: " + ove.getFoodAmount()+ " gram");
                break;
            case "hypno":
                JOptionPane.showMessageDialog(null, 
                        "Ormfoder: " + hypno.getFoodAmount()+ " gram");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Namnet finns "
                        + "inte i systemet");
                break; 
            
        }
    }

}
