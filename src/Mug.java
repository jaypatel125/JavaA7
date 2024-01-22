package JavaAssignment7;
import java.awt.*;
// Author: Jay Patel, 000881881
public class Mug extends TimsProduct {
    private Color color;
    public Mug(String name, double cost, double price, Color color) {
        super(name, cost, price); // Calling the constructor of the superclass TimsProduct
        this.color = color; // Assigning the color of the mug
    }

    // Creating a new Mug object
    public static Mug create(){
        String name = "Coffee Mocha";
        double cost = 1.99;
        double price = 2.29;
        Color color = Color.red;
        return new Mug(name, cost, price, color);
    }

    // Getter method for the color of the mug
    public Color getColor() {
        return color;
    }

    // Overriding the toString() method to print the color of the mug
    @Override
    public String toString() {
        return ("color: "+ color);
    }

    // Implementing the getConsumptionMethod() method from the Consumable interface
    public String getConsumptionMethod(String input2) {
        return ("Drink it!");
    }
}
