package JavaAssignment7;
// Author: Jay Patel, 000881881
public abstract class TimsProduct implements Commodity {

    // Declare private fields for the name, production cost, and retail price of the product
    private String name;
    private Double cost;
    private Double price;

    // Constructor to initialize the name, cost, and price fields
    public TimsProduct(String name, Double cost, Double price){
        this.name=name;
        this.cost=cost;
        this.price=price;
    }

    // Public method to get the name of the product
    public String getName() {
        return name;
    }

    // Implementation of the getProductionCost method from the Commodity interface
    public double getProductionCost(){
        return cost;
    }

    // Implementation of the getRetailPrice method from the Commodity interface
    public double getRetailPrice(){
        return price;
    }

    // Overridden toString method to return a string representation of the object's state
    @Override
    public String toString() {
        return "TimsProduct{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }
}
