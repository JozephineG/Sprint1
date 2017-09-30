package animal;

import javax.swing.JOptionPane;

public class AnimalDemo {

    public static void main(String[] args) {
        Dog sixten = new Dog(5000);
        Dog dogge = new Dog(10000);
        Cat venus = new Cat(5000);
        Cat ove = new Cat(3000);
        Snakes hypno = new Snakes(1000);

        String whatAnimal = JOptionPane.showInputDialog(null,
                "Vilket djur ska få mat?");
        switch (whatAnimal.toLowerCase()) {
            case "sixten":
                JOptionPane.showMessageDialog(null,
                        "Hundfoder: " + sixten.getFoodAmount());
                break;
            case "dogge":
                JOptionPane.showMessageDialog(null,
                        "Hundfoder: " + dogge.getFoodAmount());
                break;
            case "venus":
                JOptionPane.showMessageDialog(null,
                        "Kattfoder: " + venus.getFoodAmount());
                break;
            case "ove":
                JOptionPane.showMessageDialog(null, 
                        "Kattfoder: " + ove.getFoodAmount());
                break;
            case "hypno":
                JOptionPane.showMessageDialog(null, 
                        "Ormfoder: " + hypno.getFoodAmount());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Namnet finns inte");
                break; 
                    
                    
                    
                    
                    
                    
                    
        }
    }

}
