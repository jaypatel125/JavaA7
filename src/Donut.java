package JavaAssignment7;
// Author: Jay Patel, 000881881
public abstract class Donut implements Consumable {
    public String name;
    public double cost;
    public double price;
    private String description;
    private int calorieCount;

    public Donut(String name, double cost, double price, String description, int calorieCount) {
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.description = description;
        this.calorieCount = calorieCount;
    }

    //create donut
    private static Donut Create() { // A private static method for creating a new Donut object
        String name="boston cream"; // Assigning the name of the donut
        double cost = 1.59; // Assigning the cost of the donut
        double price = 2.10; // Assigning the price of the donut
        String description = "famous donut!"; // Assigning the description of the donut
        int calorieCount = 130; // Assigning the calorie count of the donut
        // Returning a new anonymous class that extends Donut and overrides the getCalorieCount() and getConsumptionMethod() methods
        return new Donut(name, cost, price, description, calorieCount) {
            @Override
            public int getCalorieCount(String input1) {
                return 0; // Returning 0 as the calorie count is already set in the constructor
            }

            @Override
            public String getConsumptionMethod(String input2) {
                return null; // Returning null as the consumption method is already set in the constructor
            }
        };
    }

    @Override
    public String toString() { // A method for returning a string representation of the Donut object
        return "Donut{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", calorieCount=" + calorieCount +
                '}';
    }

    public String getDescription() { // A getter method for the description field
        return description;
    }

    public int getCalorieCount() { // An implementation of the getCalorieCount() method from the Consumable interface
        return calorieCount;
    }

    public String getConsumptionMethod() { // An implementation of the getConsumptionMethod() method from the Consumable interface
        return ("Eat it!"); // Always returns "Eat it!" as the consumption method for a Donut
    }
}
