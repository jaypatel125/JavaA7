package JavaAssignment7;
// Author: Jay Patel, 000881881
import java.util.Scanner;

public class TimsOrder {
    private double AmountDue;
    private int size;
    private String name;
    private TimsProduct[] items;
    private Mug[] mug;
    private Donut[] donut;

    // This constructor is incomplete and unnecessary
    private TimsOrder(String name, int size, Object TimsProduct){
        this.name=name;
        this.size=size;
        this.items = new TimsProduct[10];
    }

    // This is the correct constructor for TimsOrder
    public TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;
        this.items = new TimsProduct[10];
    }

    // create timsOrder
    public static TimsOrder create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the name for this order?");
        String orderName = sc.nextLine();
        System.out.println("How many mugs?");
        int numOfMugs = sc.nextInt();
        Mug[] mugs = new Mug[numOfMugs];
        for (int i = 0; i < numOfMugs; i++){
            mugs[i] = Mug.create();
        }
        System.out.println("How many donuts?");
        int numOfDonuts = sc.nextInt();
        Donut[] donuts = new Donut[numOfDonuts];
        for (int i = 0; i < numOfDonuts; i++){
            donuts[i] = Donut.create();
        }
        // create TimsOrder with the given name and size, and add the ordered items
        TimsOrder order = new TimsOrder(orderName, numOfMugs + numOfDonuts);
        order.addItems(mugs);
        order.addItems(donuts);
        return order;
    }

    // Add TimsProduct to items array
    public void addItems(TimsProduct[] newItems) {
        for (int i = 0; i < newItems.length; i++) {
            if (newItems[i] != null) {
                items[i] = newItems[i];
            }
        }
    }

    // Calculate and return the total amount due for the order
    public double getAmountDue(){
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                total += items[i].getRetailPrice();
            }
        }
        this.AmountDue = total;
        return total;
    }

    @Override
    public String toString() {
        return "TimsOrder{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
