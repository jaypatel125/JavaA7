// Author: Jay Patel, 000881881
public class TestClass {
    public static void main(String[] args) {
        TimsOrder t = TimsOrder.create(); // Creating a new TimsOrder object using the create() method
        System.out.println(t); // Printing the TimsOrder object using the toString() method
        System.out.printf("Total Price: $%.2f\n", t.getAmountDue()); // Printing the total price of the TimsOrder object with two decimal places
    }
}
